package statix.cli.messages;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSystemException;
import org.metaborg.core.messages.IMessage;
import org.metaborg.core.messages.IMessagePrinter;
import org.metaborg.core.messages.MessageSeverity;
import org.metaborg.core.messages.WithLocationStreamMessagePrinter;
import org.metaborg.core.project.IProject;
import org.metaborg.core.project.IProjectService;
import org.metaborg.core.source.AffectedSourceHelper;
import org.metaborg.core.source.ISourceRegion;
import org.metaborg.core.source.ISourceTextService;

/**
 * Prints messages like {@link WithLocationStreamMessagePrinter}, but in a compact way.
 * The affected code is underlined with carets (^).
 */
public class CompactMessagePrinter implements IMessagePrinter {

    /**
     * To pretty-print the affected source code of a message.
     */
    private final ISourceTextService sourceTextService;
    /**
     * To get the relative filename of source file.
     */
    private final IProjectService projectService;

    private final PrintStream outputStream;

    public CompactMessagePrinter(ISourceTextService sourceTextService, IProjectService projectService,
        OutputStream outputStream) {
        this.sourceTextService = sourceTextService;
        this.projectService = projectService;
        this.outputStream = new PrintStream(outputStream);
    }

    @Override public void print(IMessage message, boolean pardoned) {
        print(message.message(), pardoned, message.source(), message.severity(), message.region());
    }

    @Override public void print(FileObject resource, String message, Throwable e, boolean pardoned) {
        print(message, pardoned, resource, null, null);
    }

    @Override public void print(IProject project, String message, Throwable e, boolean pardoned) {
        print(message, pardoned, null, null, null);
    }

    @Override public void printSummary() {
    }

    private void print(String message, boolean pardoned, FileObject sourceFile,
        MessageSeverity severity, ISourceRegion sourceRegion) {
        if(pardoned) {
            return;
        }

        final StringBuilder sb = new StringBuilder();
        // if available, print filename, line number, and column
        if(sourceFile != null) {
            try {
                // source file name relative to project location (so that we don't output long absolute paths)
                final IProject project = projectService.get(sourceFile);
                String relativeSourceFilename = sourceFile.getName().getBaseName();
                if(project != null // projectService.get() is @Nullable
                    && project.location().getName() != sourceFile.getName() // don't "relativize" if project == source
                ) {
                    relativeSourceFilename = project.location().getName().getRelativeName(sourceFile.getName());
                }

                sb.append(relativeSourceFilename);
                sb.append(':');

                if(sourceRegion != null && sourceRegion.startRow() != -1 && sourceRegion.startColumn() != -1) {
                    sb.append(sourceRegion.startRow() + 1); // startRow() is in [0, #lines)
                    sb.append(':');
                    sb.append(sourceRegion.startColumn() + 1);
                    sb.append(':');
                }

                sb.append(' ');
            } catch(FileSystemException ignored) {
            }
        }

        // print severity and message
        if(severity != null) {
            sb.append(severity.name().toLowerCase());
            sb.append(": ");
        }
        appendTruncated(sb, message);
        sb.append('\n');

        // if available, pretty-print source code
        if(sourceFile != null && sourceRegion != null) {
            try {
                final String affectedSource =
                    AffectedSourceHelper.affectedSourceText(sourceRegion, sourceTextService.text(sourceFile), " ");
                if(affectedSource != null) { // affectedSourceText() is @Nullable
                    sb.append(affectedSource);
                }
            } catch(IOException ignored) {
            }
        }

        outputStream.print(sb.toString());
        outputStream.flush();
    }

    /**
     * Appends a compact version of the given message. This method will only append up to the first
     * line break.
     * 
     * @param sb
     *      the string builder to append to
     * @param message
     *      the message to append
     */
    private static void appendTruncated(StringBuilder sb, String message) {
        int index = message.indexOf('\n');
        if (index == -1) index = message.indexOf("<br>");
        if (index == -1) {
            sb.append(message);
        } else {
            sb.append(message, 0, index);
        }
    }
}
