package za.ac.cput.mydavids.projectone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    App objectOne = new App();
    App objectTwo = new App();

    String[] arrayOne = {"Justin", "Michael"};

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testFloatingPoint(){
        assertEquals(1.2f, App.floatingPoint());
    }

    public void testIntegers(){
        assertEquals(700, App.integers());
    }

    public void testObjectEquality(){
        assertEquals(objectOne, App.objectEquality());
    }

    public void testObjectIdentity(){
        assertSame(objectTwo, App.objectIdentity());
    }

    public void testTruth(){
        assertEquals(false, App.truth());
    }

    public void testFalse(){
        assertEquals(true, App.isFalse());
    }

    public void testNullness(){
        assertNull(App.isNull());
    }

    public void testNonNullness(){
        assertNotNull(App.nonNull());
    }

    public void testFailingTest(){
        fail();
    }

    @Ignore
    public void testDisableTest() { System.out.println("This is disabled"); }

    public void testArraysContent()  { assertEquals(arrayOne[1], App.arraysContent());}
}
