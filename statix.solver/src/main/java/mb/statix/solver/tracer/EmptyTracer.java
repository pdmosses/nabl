package mb.statix.solver.tracer;

public class EmptyTracer extends SolverTracer<EmptyTracer.Empty> {

    public static class Empty implements SolverTracer.IResult<Empty> {

        public static final Empty instance = new Empty();

        private Empty() {}

        @Override public Empty combine(Empty other) {
            return this;
        }

        public static Empty of() {
            return instance;
        }
    }

    @Override public SolverTracer<Empty> subTracer() {
        return this;
    }

    @Override public Empty result() {
        return Empty.instance;
    }

}
