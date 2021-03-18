package src;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VectorTest
{
    /**
     * Default constructor for test class VectorTest
     */
    public VectorTest()
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
    public void test_equals()
    {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(1, 2, 3);
        Vector c = new Vector(1, 2, 3.1);
        assertEquals(true, a.equals(b));
        assertEquals(false, a.equals(c));
    }

    @Test
    public void test_length()
    {
        Vector a = new Vector(2, 10, 11);
        Vector b = new Vector(-2, 10, 11);
        Vector c = new Vector(0, 0, -5);

        assertEquals(15.0, a.length(), 1e-10);
        assertEquals(15.0, b.length(), 1e-10);
        assertEquals(5.0, c.length(), 1e-10);
    }

    @Test
    public void test_dotProduct()
    {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, -5, 6);
        Vector c = new Vector(0, 0, 3);

        assertEquals(12.0, Vector.dotProduct(a, b), 1e-10);
        assertEquals(9.0, Vector.dotProduct(a, c), 1e-10);
        assertEquals(18.0, Vector.dotProduct(b, c), 1e-10);
        assertEquals(77.0, Vector.dotProduct(b, b), 1e-10);
    }

    @Test
    public void test_winkelZu()
    {
        Vector a = new Vector(1, 0, 0);
        Vector b = new Vector(4, -5, 6);
        Vector c = new Vector(0, 0, 3);
        Vector d = new Vector(0, 0, -3);

        assertEquals(0, a.winkelZu(a), 1e-10);
        assertEquals(180.0, c.winkelZu(d), 1e-10);      
        assertEquals(62.88085722662, a.winkelZu(b), 1e-8);
        assertEquals(90.0, a.winkelZu(c), 1e-8);
        assertEquals(90.0, a.winkelZu(d), 1e-8);
    }

}
