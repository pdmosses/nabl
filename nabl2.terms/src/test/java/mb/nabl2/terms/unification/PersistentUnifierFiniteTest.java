package mb.nabl2.terms.unification;

import static mb.nabl2.terms.build.TermBuild.B;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.usethesource.capsule.Map;
import io.usethesource.capsule.Set;
import mb.nabl2.terms.ITerm;
import mb.nabl2.terms.ITermVar;

@SuppressWarnings("unused")
public class PersistentUnifierFiniteTest {

    private final ITermVar a = B.newVar("", "a");
    private final ITermVar b = B.newVar("", "b");
    private final ITermVar c = B.newVar("", "c");
    private final ITermVar d = B.newVar("", "d");

    private final String f = "f";
    private final String g = "g";
    private final String h = "h";

    private final ITerm x = B.newString("x");
    private final ITerm y = B.newString("y");
    private final ITerm z = B.newString("z");

    @Test(timeout = 1000) public void testEmpty() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, a).orElseThrow(() -> new IllegalArgumentException());
        assertTrue(phi.isEmpty());
        assertEquals(0, phi.size());
    }

    @Test(timeout = 1000) public void testNonEmpty() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, x).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, y).orElseThrow(() -> new IllegalArgumentException());
        assertFalse(phi.isEmpty());
        assertEquals(2, phi.size());
    }

    @Test(timeout = 1000) public void testVarIdentity() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        assertTrue(phi.areEqual(a, a).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testTermIdentity() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        assertTrue(phi.areEqual(B.newAppl(f, a), B.newAppl(f, a)).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testUnifySameVar() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, a).orElseThrow(() -> new IllegalArgumentException());
        assertFalse(phi.contains(a));
    }

    @Test(timeout = 1000) public void testUnifyTermArgs() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(a, B.newAppl(f, x)).orElseThrow(() -> new IllegalArgumentException());
        assertTrue(phi.areEqual(b, x).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testUnifyOccursDirect() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, a)).orElseThrow(() -> new IllegalArgumentException());
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testUnifyOccursIndirect()
            throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, B.newAppl(g, a)).orElseThrow(() -> new IllegalArgumentException());
    }

    @Test(timeout = 1000) public void testUnifyMakeEqualReps() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, b).orElseThrow(() -> new IllegalArgumentException());
        assertEquals(phi.findRep(a), phi.findRep(b));
    }

    @Test(timeout = 1000) public void testGround() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, x).orElseThrow(() -> new IllegalArgumentException());
        assertTrue(phi.isGround(a));
    }

    @Test(timeout = 1000) public void testSize() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, x, y)).orElseThrow(() -> new IllegalArgumentException());
        assertEquals(TermSize.of(3), phi.size(a));
    }

    @Test(timeout = 1000) public void testString() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, x, y)).orElseThrow(() -> new IllegalArgumentException());
        assertEquals("f(\"x\",\"y\")", phi.toString(a));
    }

    @Test(timeout = 1000) public void testRemoveUnifiedVar() throws OccursException {
        Map.Transient<ITermVar, ITermVar> reps = Map.Transient.of();
        Map.Transient<ITermVar, ITerm> terms = Map.Transient.of();
        reps.__put(a, b);
        reps.__put(b, c);
        terms.__put(d, B.newAppl(f, a));
        IUnifier.Transient phi = new PersistentUnifier.Immutable(true, reps.freeze(), Map.Immutable.of(),
                terms.freeze(), Set.Immutable.of()).melt();
        phi.remove(b);
        assertTrue(phi.areEqual(a, c).orElseThrow(v -> new RuntimeException()));
        assertTrue(phi.areEqual(d, B.newAppl(f, c)).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testRemoveFreeVar() throws OccursException {
        Map.Transient<ITermVar, ITermVar> reps = Map.Transient.of();
        Map.Transient<ITermVar, ITerm> terms = Map.Transient.of();
        reps.__put(a, b);
        reps.__put(b, c);
        IUnifier.Transient phi = new PersistentUnifier.Immutable(true, reps.freeze(), Map.Immutable.of(),
                terms.freeze(), Set.Immutable.of()).melt();
        phi.remove(c);
        assertTrue(phi.areEqual(a, b).orElseThrow(v -> new RuntimeException()));
        assertTrue(phi.areEqual(b, c).match(r -> false, r -> true)); // this throws, should be last
    }

    @Test(timeout = 1000) public void testRemoveVarWithTerm() throws OccursException {
        Map.Transient<ITermVar, ITermVar> reps = Map.Transient.of();
        Map.Transient<ITermVar, ITerm> terms = Map.Transient.of();
        reps.__put(a, b);
        terms.__put(b, B.newAppl(f, c));
        IUnifier.Transient phi = new PersistentUnifier.Immutable(true, reps.freeze(), Map.Immutable.of(),
                terms.freeze(), Set.Immutable.of()).melt();
        phi.remove(b);
        assertTrue(phi.areEqual(a, B.newAppl(f, c)).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testRetain() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        phi.retain(a);
        assertTrue(phi.areEqual(a, B.newAppl(f, x)).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testEquals() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Transient theta = PersistentUnifier.Immutable.of().melt();
        theta.unify(a, B.newAppl(f, x)).orElseThrow(() -> new IllegalArgumentException());
        theta.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        assertEquals(phi.freeze(), theta.freeze()); // equality on transients is broken
    }

    @Test(timeout = 1000) public void testEquals2() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(b, c).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Transient theta = PersistentUnifier.Immutable.of().melt();
        assertNotEquals(phi, theta);
    }

    @Test(timeout = 1000) public void testEquals3() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Transient theta = PersistentUnifier.Immutable.of().melt();
        theta.unify(a, B.newAppl(f, c)).orElseThrow(() -> new IllegalArgumentException());
        assertNotEquals(phi, theta);
    }

    @Test(timeout = 1000) public void testEquals4() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, B.newAppl(g)).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Transient theta = PersistentUnifier.Immutable.of().melt();
        theta.unify(a, B.newAppl(f, B.newAppl(g))).orElseThrow(() -> new IllegalArgumentException());
        assertNotEquals(phi, theta);
    }

    @Test(timeout = 1000) public void testEquivalenceClasses() throws OccursException {
        final IUnifier.Immutable phi = new PersistentUnifier.Immutable(true, Map.Immutable.of(a, b), Map.Immutable.of(),
                Map.Immutable.of(), Set.Immutable.of());
        final IUnifier.Immutable theta = new PersistentUnifier.Immutable(true, Map.Immutable.of(b, a),
                Map.Immutable.of(), Map.Immutable.of(), Set.Immutable.of());
        assertEquals(phi, theta);
    }

    @Test(timeout = 1000) public void testRetainRemoveInverse() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Immutable theta = phi.freeze();
        IUnifier.Immutable theta1 = theta.remove(b).unifier();
        IUnifier.Immutable theta2 = theta.retain(a).unifier();
        assertEquals(theta1, theta2);
    }

    @Test(timeout = 1000) public void testEntailment() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b)).orElseThrow(() -> new IllegalArgumentException());
        phi.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        IUnifier.Transient theta = PersistentUnifier.Immutable.of().melt();
        theta.unify(a, B.newAppl(f, x)).orElseThrow(() -> new IllegalArgumentException());
        theta.unify(b, x).orElseThrow(() -> new IllegalArgumentException());
        theta.unify(b, c).orElseThrow(() -> new IllegalArgumentException());
        theta.remove(c);
        assertEquals(phi.freeze(), theta.freeze());
    }

    @Test(timeout = 1000) public void testVariableDisunify() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        assertTrue(phi.disunify(a, b));
        assertFalse(phi.areEqual(a, b).orElseThrow(v -> new RuntimeException()));
    }

    @Test(timeout = 1000) public void testVariableDisunifyAndTransitiveUnify() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        assertTrue(phi.disunify(a, b));
        phi.unify(a, c).orElseThrow(() -> new RuntimeException());
        assertFalse(phi.unify(c, b).isPresent());
    }

    @Test(timeout = 1000) public void testVariableTransitiveUnifyAndDisunify() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, c).orElseThrow(() -> new RuntimeException());
        phi.unify(c, b).orElseThrow(() -> new RuntimeException());
        assertFalse(phi.disunify(a, b));
    }

    @Test(timeout = 1000) public void testVariableUnifyDisunifyUnify() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, c).orElseThrow(() -> new RuntimeException());
        assertTrue(phi.disunify(a, b));
        assertFalse(phi.unify(c, b).isPresent());
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive1() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(a, a), B.newTuple(a, B.newAppl(f, a)));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive2() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(a, a), B.newTuple(B.newAppl(f, a), a));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive3() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(a, B.newAppl(f, a)), B.newTuple(a, a));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive4() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(B.newAppl(f, a), a), B.newTuple(a, a));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive5() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, B.newAppl(f, b));
        phi.unify(b, B.newAppl(f, a));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive6() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(a, B.newAppl(f, a)), B.newTuple(B.newAppl(f, b), a));
    }

    @Test(timeout = 1000, expected = OccursException.class) public void testRecursive7() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(B.newTuple(B.newAppl(f, a), a), B.newTuple(b, B.newAppl(f, b)));
    }

    @Test(timeout = 1000) public void testDisunifyVariablesWithSameTerms() throws OccursException {
        IUnifier.Transient phi = PersistentUnifier.Immutable.of().melt();
        phi.unify(a, x).orElseThrow(() -> new RuntimeException());
        phi.unify(b, x).orElseThrow(() -> new RuntimeException());
        assertFalse(phi.disunify(a, b));
    }

}