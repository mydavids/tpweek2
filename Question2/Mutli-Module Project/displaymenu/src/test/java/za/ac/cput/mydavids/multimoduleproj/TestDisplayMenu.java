package za.ac.cput.mydavids.multimoduleproj;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple DisplayMenu.
 */
public class TestDisplayMenu
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestDisplayMenu(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TestDisplayMenu.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testDisplayMenu(){

        String menu = "THIS IS THE MENU OF THIS APPLICATION\n"
                + "----------------------------------------\n"
                + "Please enter your name: ";
        assertEquals(menu, DisplayMenu.showMenu());
    }
}
