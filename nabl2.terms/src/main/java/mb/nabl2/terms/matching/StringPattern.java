package mb.nabl2.terms.matching;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.ITermVar;
import mb.nabl2.terms.Terms;
import mb.nabl2.terms.substitution.ISubstitution.Transient;
import mb.nabl2.terms.unification.IUnifier;

class StringPattern extends Pattern {

    private final String value;

    public StringPattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override public Set<ITermVar> getVars() {
        return ImmutableSet.of();
    }

    @Override protected boolean matchTerm(ITerm term, Transient subst, IUnifier unifier)
            throws InsufficientInstantiationException {
        // @formatter:off
        return unifier.findTerm(term).matchOrThrow(Terms.<Boolean, InsufficientInstantiationException>checkedCases()
            .string(stringTerm -> {
                if(stringTerm.getValue().equals(value)) {
                    return true;
                } else {
                    return false;
                }
            }).var(v -> {
                throw new InsufficientInstantiationException(v);
            }).otherwise(t -> {
                return false;
            })
        );
        // @formatter:on
    }

    @Override public String toString() {
        return "\"" + value + "\"";
    }

}