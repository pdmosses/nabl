package mb.statix.solver.completeness;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.metaborg.util.functions.Function1;
import org.metaborg.util.functions.Predicate2;
import org.metaborg.util.iterators.Iterables2;
import org.metaborg.util.optionals.Optionals;

import com.google.common.collect.ImmutableList;

import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.ITermVar;
import mb.nabl2.terms.unification.IUnifier;
import mb.statix.scopegraph.reference.CriticalEdge;
import mb.statix.scopegraph.terms.AScope;
import mb.statix.scopegraph.terms.Scope;
import mb.statix.solver.IConstraint;
import mb.statix.solver.State;
import mb.statix.solver.constraint.Constraints;
import mb.statix.spec.Spec;

public class Completeness implements ICompleteness {

    private final Spec spec;
    private final Set<IConstraint> incomplete;

    public Completeness(Spec spec) {
        this.spec = spec;
        this.incomplete = new HashSet<>();
    }

    @Override public boolean isComplete(Scope scope, ITerm label, IUnifier unifier) {
        final Predicate2<ITerm, ITerm> equal = (t1, t2) -> {
            return t2.equals(label) && unifier.areEqual(t1, scope).orElse(false /* (1) */);
            /* (1) This assumes well-formed constraints and specifications,
             * which guarantee us that a non-ground scope variable is never
             * instantiated to an already known scope.
             */
        };
        return incomplete.stream().flatMap(c -> Iterables2.stream(criticalEdges(c, spec)))
                .noneMatch(sl -> equal.test(sl.scope(), sl.label()));
    }

    @Override public void add(IConstraint constraint, IUnifier unifier) {
        incomplete.add(constraint);
    }

    @Override public void remove(IConstraint constraint, IUnifier unifier) {
        incomplete.remove(constraint);
    }

    @Override public void update(ITermVar var, IUnifier unifier) {
    }

    static Collection<CriticalEdge> criticalEdges(IConstraint constraint, Spec spec) {
        // @formatter:off
        final Function1<IConstraint, Collection<CriticalEdge>> criticalEdges = Constraints.cases(
            onEqual -> ImmutableList.of(),
            onFalse -> ImmutableList.of(),
            onInequal -> ImmutableList.of(),
            onNew -> ImmutableList.of(),
            onPathDst -> ImmutableList.of(),
            onPathLabels -> ImmutableList.of(),
            onPathLt -> ImmutableList.of(),
            onPathMatch -> ImmutableList.of(),
            onPathScopes -> ImmutableList.of(),
            onPathSrc -> ImmutableList.of(),
            onResolveQuery -> ImmutableList.of(),
            onTellEdge -> ImmutableList.of(CriticalEdge.of(onTellEdge.sourceTerm(), onTellEdge.label())),
            onTellRel -> ImmutableList.of(CriticalEdge.of(onTellRel.scopeTerm(), onTellRel.relation())),
            onTermId -> ImmutableList.of(),
            onTrue -> ImmutableList.of(),
            onUser -> spec.scopeExtensions().get(onUser.name()).stream()
                              .map(il -> CriticalEdge.of(onUser.args().get(il._1()), il._2()))
                              .collect(Collectors.toList())
        );
        // @formatter:on
        return criticalEdges.apply(constraint);
    }

    public static List<CriticalEdge> criticalEdges(IConstraint constraint, State state) {
        return criticalEdges(constraint, state.spec()).stream().flatMap(ce -> {
            final Optional<CriticalEdge> edge =
                    AScope.matcher().match(ce.scope(), state.unifier()).map(s -> CriticalEdge.of(s, ce.label()));
            return Optionals.stream(edge);
        }).collect(Collectors.toList());
    }

}