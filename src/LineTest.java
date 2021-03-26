package src;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LineTest
{
    /**
     * Default constructor for test class LineTest
     */
    public LineTest()
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
    public void test_distanceTo()
    {
        Point A1 = new src.Point(1, 2, 0);
        Vector B1 = new Vector(0, 0, 1);
        Line l1 = new Line(A1, B1);

        Point A2 = new src.Point(0, 0, 0);
        Vector B2 = new Vector(1, 1, 1);
        Line l2 = new Line(A2, B2);

        assertEquals(0.7071067811865, l1.distanceTo(l2), 1e-10);
    }

    @Test
    public void test_fusspunktFindenZu()
    {
        Point A1 = new src.Point(0, 0, 0);
        Point A2 = new src.Point(1, 2, 0);
        Vector B1 = new Vector(1, 1, 1);
        Vector B2 = new Vector(0, 0, 1);
        Line l1 = new Line(A1, B1);
        Line l2 = new Line(A2, B2);
        // l1.fusspunktFindenZu(l2);
    }

    @Test
    public void test_angleTo()
    {
        Point A1 = new src.Point(1, 2, 0);
        Vector B1 = new Vector(1, 1, 1);

        Point A2 = new src.Point(1, 2, 0);
        Vector B2 = new Vector(0, 0, 1);

        Line l1 = new Line(A1, B1);
        Line l2 = new Line(A2, B2);

        Vector n = new Vector(1, 1, 1);
        Vector A = new Vector(2, 0, 0);
        Plane p = new Plane(n, A);

        assertEquals(45, l1.angleTo(l2), 1e-10);        
        assertEquals(0, l1.angleTo(p), 1e-10);
        assertEquals(35.26438968275, l1.angleTo(p), 1e-10);
    }

}
