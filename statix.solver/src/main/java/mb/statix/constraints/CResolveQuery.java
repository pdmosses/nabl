package mb.statix.constraints;

import java.io.Serializable;
import java.util.Objects;

import javax.annotation.Nullable;

import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.substitution.IRenaming;
import mb.nabl2.terms.substitution.ISubstitution;
import mb.nabl2.util.TermFormatter;
import mb.scopegraph.oopsla20.reference.ResolutionException;
import mb.statix.constraints.messages.IMessage;
import mb.statix.solver.IConstraint;
import mb.statix.solver.query.QueryFilter;
import mb.statix.solver.query.QueryMin;
import mb.statix.solver.query.QueryProject;

public final class CResolveQuery extends AResolveQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    public CResolveQuery(QueryFilter filter, QueryMin min, QueryProject project, ITerm scopeTerm, ITerm resultTerm) {
        this(filter, min, project, scopeTerm, resultTerm, null, null);
    }

    // Do not call this constructor. This is only used to reconstruct this object from a Statix term. Call withArguments() or withMessage() instead.
    public CResolveQuery(
            QueryFilter filter,
            QueryMin min,
            QueryProject project,
            ITerm scopeTerm,
            ITerm resultTerm,
            @Nullable IMessage message
    ) {
        this(filter, min, project, scopeTerm, resultTerm, null, message);
    }

    // Do not call this constructor. Call withArguments(), withCause(), or withMessage() instead.
    public CResolveQuery(
            QueryFilter filter,
            QueryMin min,
            QueryProject project,
            ITerm scopeTerm,
            ITerm resultTerm,
            @Nullable IConstraint cause,
            @Nullable IMessage message
    ) {
        super(filter, min, project, scopeTerm, resultTerm, cause, message);
    }

    public CResolveQuery withArguments(
            QueryFilter filter,
            QueryMin min,
            QueryProject project,
            ITerm scopeTerm,
            ITerm resultTerm
    ) {
        return new CResolveQuery(filter, min, project, scopeTerm, resultTerm, cause, message);
    }

    @Override public <R> R match(Cases<R> cases) {
        return cases.caseResolveQuery(this);
    }

    @Override public <R, E extends Throwable> R matchInResolution(ResolutionFunction1<CResolveQuery, R> onResolveQuery,
            ResolutionFunction1<CCompiledQuery, R> onCompiledQuery) throws ResolutionException, InterruptedException {
        return onResolveQuery.apply(this);
    }

    @Override public CResolveQuery withCause(@Nullable IConstraint cause) {
        return new CResolveQuery(filter, min, project, scopeTerm, resultTerm, cause, message);
    }

    @Override public CResolveQuery withMessage(@Nullable IMessage message) {
        return new CResolveQuery(filter, min, project, scopeTerm, resultTerm, cause, message);
    }

    @Override public CResolveQuery apply(ISubstitution.Immutable subst) {
        return new CResolveQuery(
                filter.apply(subst),
                min.apply(subst),
                project,
                subst.apply(scopeTerm),
                subst.apply(resultTerm),
                cause,
                message == null ? null : message.apply(subst)
        );
    }

    @Override public CResolveQuery unsafeApply(ISubstitution.Immutable subst) {
        return new CResolveQuery(
                filter.unsafeApply(subst),
                min.unsafeApply(subst),
                project,
                subst.apply(scopeTerm),
                subst.apply(resultTerm),
                cause,
                message == null ? null : message.apply(subst)
        );
    }

    @Override public CResolveQuery apply(IRenaming subst) {
        return new CResolveQuery(
                filter.apply(subst),
                min.apply(subst),
                project,
                subst.apply(scopeTerm),
                subst.apply(resultTerm),
                cause,
                message == null ? null : message.apply(subst)
        );
    }

    @Override public String toString(TermFormatter termToString) {
        final StringBuilder sb = new StringBuilder();
        sb.append("query ");
        sb.append(filter.toString(termToString));
        sb.append(" ");
        sb.append(min.toString(termToString));
        sb.append(" ");
        sb.append(project.toString(termToString));
        sb.append(" in ");
        sb.append(termToString.format(scopeTerm));
        sb.append(" |-> ");
        sb.append(termToString.format(resultTerm));
        return sb.toString();
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        final CResolveQuery that = (CResolveQuery)o;
        // @formatter:off
        return this.hashCode == that.hashCode
            && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.min, that.min)
            && Objects.equals(this.project, that.project)
            && Objects.equals(this.scopeTerm, that.scopeTerm)
            && Objects.equals(this.resultTerm, that.resultTerm)
            && Objects.equals(this.cause, that.cause)
            && Objects.equals(this.message, that.message);
        // @formatter:on
    }

    private final int hashCode = computeHashCode();

    @Override public int hashCode() {
        return hashCode;
    }

    private int computeHashCode() {
        return Objects.hash(
                filter,
                min,
                project,
                scopeTerm,
                resultTerm,
                cause,
                message
        );
    }

}
