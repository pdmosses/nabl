package mb.p_raffrayi;

import org.immutables.value.Value;

@Value.Immutable
public abstract class APRaffrayiSettings {

    @Value.Parameter public abstract boolean incrementalDeadlock();

    @Value.Parameter public abstract boolean scopeGraphDiff();

    @Value.Parameter public abstract ConfirmationMode confirmationMode();

    public boolean incremental() {
        return incrementalDeadlock() || scopeGraphDiff();
    }

    public enum ConfirmationMode {
        TRIVIAL, SIMPLE_ENVIRONMENT
    }

}
