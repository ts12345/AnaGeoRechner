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
}
