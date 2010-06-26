/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malygos
 */
public class FuzzyPartTest {

    public FuzzyPartTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class FuzzyPart.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        FuzzyPart instance = new FuzzyPart();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class FuzzyPart.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        FuzzyPart instance = new FuzzyPart();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class FuzzyPart.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        FuzzyPart instance = new FuzzyPart();
        List expResult = null;
        List result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPoints method, of class FuzzyPart.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        List<float[]> points = null;
        FuzzyPart instance = new FuzzyPart();
        instance.setPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinimum method, of class FuzzyPart.
     */
    @Test
    public void testGetMinimum() {
        System.out.println("getMinimum");
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getMinimum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximum method, of class FuzzyPart.
     */
    @Test
    public void testGetMaximum() {
        System.out.println("getMaximum");
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getMaximum();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class FuzzyPart.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        float y = 0.0F;
        FuzzyPart instance = new FuzzyPart();
        float[] expResult = null;
        float[] result = instance.getX(y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class FuzzyPart.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        float x = 0.0F;
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getY(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCenter method, of class FuzzyPart.
     */
    @Test
    public void testGetCenter() {
        System.out.println("getCenter");
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getCenter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isInPart method, of class FuzzyPart.
     */
    @Test
    public void testIsInPart() {
        System.out.println("isInPart");
        float exactValue = 0.0F;
        FuzzyPart instance = new FuzzyPart();
        boolean expResult = false;
        boolean result = instance.isInPart(exactValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isTrivial method, of class FuzzyPart.
     */
    @Test
    public void testIsTrivial() {
        System.out.println("isTrivial");
        float exactValue = 0.0F;
        FuzzyPart instance = new FuzzyPart();
        boolean expResult = false;
        boolean result = instance.isTrivial(exactValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTrivialResult method, of class FuzzyPart.
     */
    @Test
    public void testGetTrivialResult() {
        System.out.println("getTrivialResult");
        float exactValue = 0.0F;
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getTrivialResult(exactValue);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHighestPoint method, of class FuzzyPart.
     */
    @Test
    public void testGetHighestPoint() {
        System.out.println("getHighestPoint");
        FuzzyPart instance = new FuzzyPart();
        float expResult = 0.0F;
        float result = instance.getHighestPoint();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}