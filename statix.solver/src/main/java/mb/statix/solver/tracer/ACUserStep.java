package mb.statix.solver.tracer;

import mb.statix.constraints.CUser;
import mb.statix.spec.ApplyResult;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
public abstract class ACUserStep implements IStep {

    @Value.Parameter @Override public abstract CUser constraint();

    @Value.Parameter @Override public abstract StepResult result();

    @Value.Parameter public abstract @Nullable ApplyResult applyResult();

}
