package mb.nabl2.terms.build;

import java.util.List;

import org.immutables.serial.Serial;
import org.immutables.value.Value;
import org.metaborg.util.collection.ImList;

import mb.nabl2.terms.IApplTerm;
import mb.nabl2.terms.ITerm;

@Value.Immutable(lazyhash = false)
@Serial.Version(value = 42L)
abstract class AAppl3Term extends AbstractApplTerm implements IApplTerm {

    @Override @Value.Check protected AAppl3Term check() {
        return this;
    }

    @Value.Parameter @Override public abstract String getOp();

    @Value.Parameter public abstract ITerm getArg0();

    @Value.Parameter public abstract ITerm getArg1();

    @Value.Parameter public abstract ITerm getArg2();

    @Override public List<ITerm> getArgs() {
        return ImList.Immutable.of(getArg0(), getArg1(), getArg2());
    }

    @Override public int getArity() {
        return 3;
    }

    @Override public <T> T match(Cases<T> cases) {
        return cases.caseAppl(this);
    }

    @Override public <T, E extends Throwable> T matchOrThrow(CheckedCases<T, E> cases) throws E {
        return cases.caseAppl(this);
    }

    @Override public int hashCode() {
        return super.hashCode();
    }

    @Override public boolean equals(Object other) {
        return super.equals(other);
    }

    @Override public String toString() {
        return super.toString();
    }

}
