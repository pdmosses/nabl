package mb.statix.solver;

import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

import com.google.common.collect.Sets;

public class Solver {

    private Solver() {
    }

    public static Config solve(Config config, IDebugContext debug) throws InterruptedException {
        debug.info("Solving constraints");

        // set-up
        final Set<IConstraint> constraints = Sets.newConcurrentHashSet(config.getConstraints());
        State state = config.state();

        // fixed point
        boolean progress = true;
        outer: while(progress) {
            progress = false;
            final Iterator<IConstraint> it = constraints.iterator();
            while(it.hasNext()) {
                if(Thread.interrupted()) {
                    throw new InterruptedException();
                }
                final IConstraint constraint = it.next();
                debug.info("Solving {}", constraint.toString(state.unifier()));
                Optional<Config> maybeResult = constraint.solve(state.withErroneous(false), debug.subContext());
                if(maybeResult.isPresent()) {
                    progress = true;
                    it.remove();
                    final Config result = maybeResult.get();
                    state = result.state();
                    if(!debug.isRoot() && state.isErroneous()) {
                        debug.info("Break early because of errors.");
                        break outer;
                    }
                    // FIXME update properties in state
                    debug.info("Simplified {} to {}", constraint.toString(state.unifier()), result.getConstraints());
                    constraints.addAll(result.getConstraints());
                } else {
                    debug.info("Delayed {}", constraint.toString(state.unifier()));
                }
            }
        }

        // return
        debug.info("Solved {} errors and {} remaining constraints.", state.isErroneous() ? "with" : "without",
                constraints.size());
        return Config.of(state, constraints);
    }

}