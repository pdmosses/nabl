package org.metaborg.meta.nabl2.solver.properties;

import java.util.Collection;

import org.metaborg.meta.nabl2.constraints.IConstraint;
import org.metaborg.meta.nabl2.constraints.ast.IAstConstraint;
import org.metaborg.meta.nabl2.constraints.base.IBaseConstraint;
import org.metaborg.meta.nabl2.constraints.equality.IEqualityConstraint;
import org.metaborg.meta.nabl2.constraints.nameresolution.INameResolutionConstraint;
import org.metaborg.meta.nabl2.constraints.poly.IPolyConstraint;
import org.metaborg.meta.nabl2.constraints.relations.IRelationConstraint;
import org.metaborg.meta.nabl2.constraints.sets.ISetConstraint;
import org.metaborg.meta.nabl2.terms.ITerm;
import org.metaborg.meta.nabl2.terms.ITermVar;
import org.metaborg.meta.nabl2.unification.IUnifier;
import org.metaborg.meta.nabl2.unification.VarMultiset;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;

public class ActiveVars implements IConstraintSetProperty {

    private final IUnifier unifier;
    private final VarMultiset activeVars;

    public ActiveVars(IUnifier unifier) {
        this.unifier = unifier;
        this.activeVars = new VarMultiset(unifier);
    }

    // ---------------------------------------------

    @Override public boolean add(IConstraint constraint) {
        final Multiset<ITermVar> vars = findActiveVars(constraint);
        boolean change = false;
        for(ITermVar var : vars) {
            change |= add(var);
        }
        return change;
    }

    public boolean add(ITerm term) {
        return activeVars.addAll(term.getVars());
    }

    @Override public boolean update(final Collection<ITermVar> vars) {
        return activeVars.update(vars);
    }

    @Override public boolean remove(IConstraint constraint) {
        final Multiset<ITermVar> vars = findActiveVars(constraint);
        return activeVars.removeAll(vars);
    }

    public boolean isNotActive(ITerm term) {
        return term.getVars().elementSet().stream().noneMatch(var -> activeVars.contains(var));
    }

    // ---------------------------------------------

    private Multiset<ITermVar> findActiveVars(IConstraint constraint) {
        final Multiset<ITermVar> vars = HashMultiset.create();
        getActiveVars(constraint).stream().map(unifier::find).map(ITerm::getVars).forEach(vars::addAll);
        return vars;
    }

    private static Multiset<ITermVar> getActiveVars(IConstraint constraint) {
        final Multiset<ITermVar> vars = HashMultiset.create();
        constraint.match(
                IConstraint.Cases.of(ActiveVars::getActiveVars, ActiveVars::getActiveVars, ActiveVars::getActiveVars,
                        ActiveVars::emptyActiveVars, ActiveVars::getActiveVars, ActiveVars::getActiveVars,
                        ActiveVars::getActiveVars, ActiveVars::emptyActiveVars, ActiveVars::getActiveVars))
                .stream().map(ITerm::getVars).forEach(vars::addAll);
        return vars;
    }

    private static Multiset<ITermVar> getActiveVars(IAstConstraint constraint) {
        return constraint.match(IAstConstraint.Cases.of(
        // @formatter:off
            p -> p.getValue().getVars()
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(IBaseConstraint constraint) {
        return constraint.match(IBaseConstraint.Cases.of(
        // @formatter:off
            t -> ImmutableMultiset.of(),
            f -> ImmutableMultiset.of(),
            c -> {
                Multiset<ITermVar> activeVars = HashMultiset.create();
                activeVars.addAll(getActiveVars(c.getLeft()));
                activeVars.addAll(getActiveVars(c.getRight()));
                return ImmutableMultiset.copyOf(activeVars);
            },
            e -> {
                Multiset<ITermVar> activeVars = HashMultiset.create(getActiveVars(e.getConstraint()));
                activeVars.removeAll(e.getEVars());
                return ImmutableMultiset.copyOf(activeVars);
            },
            n -> {
                Multiset<ITermVar> activeVars = HashMultiset.create();
                n.getNVars().forEach(v -> activeVars.addAll(v.getVars()));
                return ImmutableMultiset.copyOf(activeVars);
            }
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(IEqualityConstraint constraint) {
        return constraint.match(IEqualityConstraint.Cases.of(
        // @formatter:off
            eq -> Multisets.sum(eq.getLeft().getVars(),eq.getRight().getVars()),
            neq -> ImmutableMultiset.of()
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(INameResolutionConstraint constraint) {
        return constraint.match(INameResolutionConstraint.Cases.of(
        // @formatter:off
            r -> r.getDeclaration().getVars(),
            a -> a.getScope().getVars(),
            dp -> dp.getValue().getVars()
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(IRelationConstraint constraint) {
        return constraint.match(IRelationConstraint.Cases.of(
        // @formatter:off
            br -> ImmutableMultiset.of(),
            cr -> ImmutableMultiset.of(),
            ev -> ev.getResult().getVars()
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(ISetConstraint constraint) {
        return constraint.match(ISetConstraint.Cases.of(
        // @formatter:off
            subseteq -> ImmutableMultiset.of(),
            distinct -> ImmutableMultiset.of(),
            eval -> eval.getResult().getVars()
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> getActiveVars(IPolyConstraint constraint) {
        return constraint.match(IPolyConstraint.Cases.of(
        // @formatter:off
            gen -> Multisets.sum(gen.getDeclaration().getVars(), ImmutableMultiset.of(gen.getGenVars())),
            inst -> {
                Multiset<ITermVar> vars = HashMultiset.create();
                vars.addAll(inst.getType().getVars());
                vars.addAll(inst.getDeclaration().getVars());
                vars.add(inst.getInstVars());
                return vars;
            }
            // @formatter:on
        ));
    }

    private static Multiset<ITermVar> emptyActiveVars(@SuppressWarnings("unused") IConstraint constraint) {
        return ImmutableMultiset.of();
    }

}