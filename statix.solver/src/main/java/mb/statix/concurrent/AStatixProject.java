package mb.statix.concurrent;

import java.util.Map;
import java.util.Optional;

import javax.annotation.Nullable;

import org.immutables.value.Value;

import mb.nabl2.terms.ITerm;
import mb.statix.scopegraph.Scope;
import mb.statix.solver.tracer.SolverTracer;
import mb.statix.spec.Rule;
import mb.p_raffrayi.IUnitResult;
import mb.p_raffrayi.impl.Result;

@Value.Immutable
public abstract class AStatixProject<TR  extends SolverTracer.IResult<TR>> implements IStatixProject<TR> {

    @Value.Parameter @Override public abstract String resource();

    @Value.Parameter @Override public abstract Optional<Rule> rule();

    @Value.Parameter @Override public abstract Map<String, IStatixGroup> groups();

    @Value.Parameter @Override public abstract Map<String, IStatixUnit> units();

    @Value.Parameter @Override public abstract Map<String, IStatixLibrary> libraries();

    @Value.Parameter @Override public abstract boolean changed();

    @Value.Parameter @Override public abstract @Nullable IUnitResult<Scope, ITerm, ITerm, Result<Scope, ITerm, ITerm, ProjectResult<TR>, SolverState>> previousResult();

    @Override public String toString() {
        return "StatixProject@" + System.identityHashCode(this);
    }

}
