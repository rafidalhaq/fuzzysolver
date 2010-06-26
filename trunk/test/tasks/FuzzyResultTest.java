/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks;

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
public class FuzzyResultTest {

    public FuzzyResultTest() {
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
     * Test of getPart method, of class FuzzyResult.
     */
    @Test
    public void testGetPart() {
        System.out.println("getPart");
        FuzzyResult instance = new FuzzyResult();
        FuzzyPart expResult = null;
        FuzzyPart result = instance.getPart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPart method, of class FuzzyResult.
     */
    @Test
    public void testSetPart() {
        System.out.println("setPart");
        FuzzyPart part = null;
        FuzzyResult instance = new FuzzyResult();
        instance.setPart(part);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExactValue method, of class FuzzyResult.
     */
    @Test
    public void testGetExactValue() {
        System.out.println("getExactValue");
        FuzzyResult instance = new FuzzyResult();
        float expResult = 0.0F;
        float result = instance.getExactValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExactValue method, of class FuzzyResult.
     */
    @Test
    public void testSetExactValue() {
        System.out.println("setExactValue");
        float exactValue = 0.0F;
        FuzzyResult instance = new FuzzyResult();
        instance.setExactValue(exactValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEffectiveDegree method, of class FuzzyResult.
     */
    @Test
    public void testGetEffectiveDegree() {
        System.out.println("getEffectiveDegree");
        FuzzyResult instance = new FuzzyResult();
        float expResult = 0.0F;
        float result = instance.getEffectiveDegree();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEffectiveDegree method, of class FuzzyResult.
     */
    @Test
    public void testSetEffectiveDegree() {
        System.out.println("setEffectiveDegree");
        float effectiveDegree = 0.0F;
        FuzzyResult instance = new FuzzyResult();
        instance.setEffectiveDegree(effectiveDegree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}