package mb.statix.solver.guard;

import java.util.Optional;

import mb.nabl2.terms.substitution.ISubstitution;
import mb.nabl2.terms.unification.IUnifier;
import mb.nabl2.terms.unification.PersistentUnifier;
import mb.statix.solver.IDebugContext;
import mb.statix.solver.IGuard;
import mb.statix.solver.State;

public class GFalse implements IGuard {

    @Override public IGuard apply(ISubstitution.Immutable subst) {
        return this;
    }

    @Override public Optional<State> solve(State state, IDebugContext debug) {
        return Optional.of(state.addError());
    }

    @Override public String toString(IUnifier unifier) {
        return "false";
    }

    @Override public String toString() {
        return toString(PersistentUnifier.Immutable.of());
    }

}