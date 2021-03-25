package src;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlaneTest
{
    /**
     * Default constructor for test class PlaneTest
     */
    public PlaneTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test_ConstruktorPointPointPoint() {
        Vector n = new Vector(1, 1, 1);
        Vector A = new Vector(2, 0, 0);

        Plane p1 = new Plane(n, A);

        Point AA = new Point(2, 0, 0);
        Point BB = new Point(4, -2, 0);
        Point CC = new Point(3, 1, -2);

        Plane p2 = new Plane(AA, BB, CC);

        assertEquals(true, p1.equals(p2));
    }

    @Test
    public void test_ConstruktorParametricForm() {
        Vector n = new Vector(1, 1, 1);
        Vector A = new Vector(2, 0, 0);
        Plane p1 = new Plane(n, A);

        Vector u = new Vector(1, -1, 0);
        Vector v = new Vector(3, 1, -4);

        Plane p2 = new Plane(A, u, v);

        assertEquals(true, p1.equals(p2));
    }

    @Test
    public void test_contains() {
        Vector n = new Vector(1, 1, 1);
        Vector A = new Vector(2, 0, 0);

        Plane p = new Plane(n, A);

        Point AA = new Point(3, -1, 0);
        Point BB = new Point(3, -1, 5);

        assertEquals(true, p.contains(AA));
        assertEquals(false, p.contains(BB));

        Vector u = new Vector(1, 2, -3);
        Line l1 = new Line(new Point(A), u);     
        Line l2 = new Line(new Point(A), n);

        assertEquals(true, p.contains(l1));
        assertEquals(false, p.contains(l2));
    }

    @Test
    public void test_distanceTo() {
        Vector n = new Vector(1, 1, 1);
        Vector A = new Vector(2, 0, 0);

        Plane p = new Plane(n, A);

        Point AA = new Point(1, 1, 1);
        Point BB = new Point(3, 1, 1);

        assertEquals(0, p.distanceTo(AA), 1e-10);
        assertEquals(2, p.distanceTo(BB), 1e-10); 
    }
}
