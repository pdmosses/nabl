package mb.statix.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.metaborg.util.future.AggregateFuture;
import org.metaborg.util.future.IFuture;
import org.metaborg.util.log.ILogger;
import org.metaborg.util.log.LoggerUtils;
import org.metaborg.util.unit.Unit;

import mb.nabl2.terms.ITerm;
import mb.p_raffrayi.ITypeCheckerContext;
import mb.p_raffrayi.IUnitResult;
import mb.statix.scopegraph.Scope;
import mb.statix.solver.log.IDebugContext;
import mb.statix.solver.persistent.SolverResult;
import mb.statix.spec.Spec;

public class ProjectTypeChecker extends AbstractTypeChecker<ProjectResult> {

    private static final ILogger logger = LoggerUtils.logger(ProjectTypeChecker.class);

    private final IStatixProject project;

    public ProjectTypeChecker(IStatixProject project, Spec spec, IDebugContext debug) {
        super(spec, debug);
        this.project = project;
    }

    @Override public IFuture<ProjectResult> run(ITypeCheckerContext<Scope, ITerm, ITerm> context,
            @SuppressWarnings("unused") List<Scope> rootScopes) {
        final Scope projectScope = makeSharedScope(context, "s_prj");

        final IFuture<Map<String, IUnitResult<Scope, ITerm, ITerm, Unit>>> libraryResults =
                runLibraries(context, project.libraries(), projectScope);

        final IFuture<Map<String, IUnitResult<Scope, ITerm, ITerm, GroupResult>>> groupResults =
                runGroups(context, project.groups(), projectScope);

        final IFuture<Map<String, IUnitResult<Scope, ITerm, ITerm, UnitResult>>> unitResults =
                runUnits(context, project.units(), projectScope);

        context.closeScope(projectScope);

        final IFuture<SolverResult> result = runSolver(context, project.rule(), Arrays.asList(projectScope));

        return AggregateFuture.apply(libraryResults, groupResults, unitResults, result).thenApply(e -> {
            return ProjectResult.of(project.resource(), e._1(), e._2(), e._3(), e._4(), null);
        }).whenComplete((r, ex) -> {
            logger.debug("project {}: returned.", context.id());
        });
    }

}