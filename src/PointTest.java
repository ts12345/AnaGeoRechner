package src;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest
{

    public PointTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test_whichOctant()
    {
        assertEquals(1, (new Point(1,1,1)).whichOctant());
        assertEquals(2, (new Point(-1,1,1)).whichOctant());
        assertEquals(3, (new Point(-1,-1,1)).whichOctant());
        assertEquals(4, (new Point(1,-1,1)).whichOctant());        
        assertEquals(5, (new Point(1,1,-1)).whichOctant());
        assertEquals(6, (new Point(-1,1,-1)).whichOctant());
        assertEquals(7, (new Point(-1,-1,-1)).whichOctant());
        assertEquals(8, (new Point(1,-1,-1)).whichOctant());            
    }

    @Test
    public void test_distanceTo()
    {

        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(1, 2, 2);        
        assertEquals(3, p1.distanceTo(p2), 0.00000000001);            
    }

    @Test
    public void test_equals()
    {
        Point a = new Point(1, 2, 3);
        Point b = new Point(1, 2, 3);
        Point c = new Point(1, 2, 3.1);
        assertEquals(true, a.equals(b));
        assertEquals(false, a.equals(c));
    }

}
