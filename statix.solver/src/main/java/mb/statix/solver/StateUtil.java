package mb.statix.solver;

import java.util.List;

import org.metaborg.util.functions.Action1;

import com.google.common.collect.ImmutableList;

import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.unification.u.IUnifier;
import mb.nabl2.terms.unification.ud.Diseq;
import mb.nabl2.terms.unification.ud.IUniDisunifier;
import mb.nabl2.util.collections.IRelation3;
import mb.statix.constraints.CAstProperty;
import mb.statix.constraints.CEqual;
import mb.statix.constraints.CInequal;
import mb.statix.constraints.CTellEdge;
import mb.statix.constraints.CTellRel;
import mb.statix.scopegraph.IScopeGraph;

public class StateUtil {

    public static List<IConstraint>
            asConstraint(IScopeGraph<? extends ITerm, ? extends ITerm, ? extends ITerm> scopeGraph) {
        final ImmutableList.Builder<IConstraint> constraints = ImmutableList.builder();
        scopeGraph.getData().forEach((scopeLabel, data) -> {
            data.forEach(datum -> {
                constraints.add(new CTellRel(scopeLabel.getKey(), scopeLabel.getValue(), datum));
            });
        });
        scopeGraph.getEdges().forEach((scopeLabel, scopes) -> {
            scopes.forEach(scope -> {
                constraints.add(new CTellEdge(scopeLabel.getKey(), scopeLabel.getValue(), scope));
            });
        });
        return constraints.build();
    }

    public static List<IConstraint>
            asConstraint(IRelation3<? extends ITerm, ? extends ITerm, ? extends ITerm> termProperties) {
        final ImmutableList.Builder<IConstraint> constraints = ImmutableList.builder();
        termProperties.stream().forEach(idxPropTerm -> {
            idxPropTerm.apply((idx, prop, term) -> {
                constraints.add(new CAstProperty(idx, prop, term));
                return null;
            });
        });
        return constraints.build();
    }

    public static List<IConstraint> asConstraint(IUniDisunifier unifier) {
        final ImmutableList.Builder<IConstraint> constraints = ImmutableList.builder();
        buildEqualities(unifier, constraints::add);
        buildInequalities(unifier.disequalities(), constraints::add);
        return constraints.build();
    }

    public static List<CEqual> asEqualities(IUnifier unifier) {
        final ImmutableList.Builder<CEqual> constraints = ImmutableList.builder();
        buildEqualities(unifier, constraints::add);
        return constraints.build();
    }

    public static List<CInequal> asInequalities(IUniDisunifier unifier) {
        final ImmutableList.Builder<CInequal> constraints = ImmutableList.builder();
        buildInequalities(unifier.disequalities(), constraints::add);
        return constraints.build();
    }

    private static void buildEqualities(IUnifier unifier, Action1<CEqual> add) {
        unifier.equalityMap().forEach((left, right) -> {
            add.apply(new CEqual(left, right));
        });
    }

    private static void buildInequalities(Iterable<Diseq> diseqs, Action1<CInequal> add) {
        diseqs.forEach(diseq -> {
            diseq.toTuple().apply((us, left, right) -> {
                add.apply(new CInequal(us, left, right));
                return null;
            });
        });
    }

}