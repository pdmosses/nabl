package mb.nabl2.terms.build;

import java.util.Objects;

import org.immutables.value.Value;

import io.usethesource.capsule.Set;
import mb.nabl2.terms.IApplTerm;
import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.ITermVar;

public abstract class AbstractApplTerm extends AbstractTerm implements IApplTerm {

    @Value.Check protected abstract IApplTerm check(); // return type must match the class, so cannot be
                                                       // implemented in a superclass, but must be implemented
                                                       // in every subclass.

    @Value.Parameter @Override public abstract String getOp();

    @Value.Lazy @Override public int getArity() {
        return getArgs().size();
    }

    @Value.Lazy @Override public boolean isGround() {
        return getArgs().stream().allMatch(ITerm::isGround);
    }

    @Value.Lazy @Override public Set.Immutable<ITermVar> getVars() {
        final Set.Transient<ITermVar> vars = Set.Transient.of();
        for(ITerm arg : getArgs()) {
            vars.__insertAll(arg.getVars());
        }
        return vars.freeze();
    }

    @Override public <T> T match(Cases<T> cases) {
        return cases.caseAppl(this);
    }

    @Override public <T, E extends Throwable> T matchOrThrow(CheckedCases<T, E> cases) throws E {
        return cases.caseAppl(this);
    }

    private volatile int hashCode;

    @Override public int hashCode() {
        int result = hashCode;
        if(result == 0) {
            result = Objects.hash(getOp(), getArity(), getArgs());
            hashCode = result;
        }
        return result;
    }

    @Override public boolean equals(Object other) {
        if(this == other)
            return true;
        if(!(other instanceof IApplTerm))
            return false;
        IApplTerm that = (IApplTerm) other;
        if(this.hashCode() != that.hashCode())
            return false;
        // @formatter:off
        return Objects.equals(this.getOp(), that.getOp())
            && Objects.equals(this.getArity(), that.getArity())
            && Objects.equals(this.getArgs(), that.getArgs());
        // @formatter:on
    }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getOp());
        sb.append("(");
        boolean first = true;
        for(ITerm arg : getArgs()) {
            if(first) {
                first = false;
            } else {
                sb.append(",");
            }
            sb.append(arg.toString());
        }
        sb.append(")");
        return sb.toString();
    }

}
