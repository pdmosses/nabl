package mb.nabl2.terms.matching;

import static mb.nabl2.terms.build.TermBuild.B;

import java.util.Objects;
import java.util.Optional;

import org.metaborg.util.collection.CapsuleUtil;
import org.metaborg.util.functions.Action2;
import org.metaborg.util.functions.Function0;
import org.metaborg.util.functions.Function1;

import io.usethesource.capsule.Set;
import mb.nabl2.terms.IApplTerm;
import mb.nabl2.terms.IAttachments;
import mb.nabl2.terms.IBlobTerm;
import mb.nabl2.terms.IIntTerm;
import mb.nabl2.terms.IListTerm;
import mb.nabl2.terms.IStringTerm;
import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.ITermVar;
import mb.nabl2.terms.Terms;
import mb.nabl2.terms.substitution.IRenaming;
import mb.nabl2.terms.substitution.ISubstitution;
import mb.nabl2.terms.unification.u.IUnifier;

class IntPattern extends Pattern {
    private static final long serialVersionUID = 1L;

    private final int value;

    public IntPattern(int value, IAttachments attachments) {
        super(attachments);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override public Set<ITermVar> getVars() {
        return CapsuleUtil.immutableSet();
    }

    @Override public boolean isConstructed() {
        return true;
    }

    @Override protected boolean matchTerm(ITerm term, ISubstitution.Transient subst, IUnifier.Immutable unifier,
            Eqs eqs) {
        final IntPattern pattern = this;
        ITerm subj = unifier.findTerm(term);
        switch(subj.termTag()) {
            case IIntTerm: { IIntTerm intTerm = (IIntTerm) subj;
                return intTerm.getValue() == value;
            }

            case ITermVar: { ITermVar v = (ITermVar) subj;
                eqs.add(v, pattern);
                return true;
            }

            case IApplTerm:
            case IConsTerm:
            case INilTerm:
            case IStringTerm:
            case IBlobTerm: {
                return false;
            }
        }
        // N.B. don't use this in default case branch, instead use IDE to catch non-exhaustive switch statements
        throw new RuntimeException("Missing case for ITerm subclass/tag");
    }

    @Override public IntPattern apply(IRenaming subst) {
        return this;
    }

    @Override public Pattern eliminateWld(Function0<ITermVar> fresh) {
        return this;
    }

    @Override protected ITerm asTerm(Action2<ITermVar, ITerm> equalities,
            Function1<Optional<ITermVar>, ITermVar> fresh) {
        return B.newInt(value, getAttachments());
    }

    @Override public String toString() {
        return Integer.toString(value);
    }

    @Override public boolean equals(Object o) {
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        IntPattern that = (IntPattern) o;
        return value == that.value;
    }

    @Override public int hashCode() {
        return Objects.hash(value);
    }
}
