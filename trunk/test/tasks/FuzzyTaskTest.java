/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks;

import java.awt.Color;
import java.awt.Graphics;
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
public class FuzzyTaskTest {

    public FuzzyTaskTest() {
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
     * Test of getName method, of class FuzzyTask.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        FuzzyTask instance = new FuzzyTaskImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class FuzzyTask.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinguisticVariables method, of class FuzzyTask.
     */
    @Test
    public void testGetLinguisticVariables() {
        System.out.println("getLinguisticVariables");
        FuzzyTask instance = new FuzzyTaskImpl();
        List expResult = null;
        List result = instance.getLinguisticVariables();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLinguisticVariables method, of class FuzzyTask.
     */
    @Test
    public void testSetLinguisticVariables() {
        System.out.println("setLinguisticVariables");
        List<LinguisticVariable> linguisticVariables = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.setLinguisticVariables(linguisticVariables);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobFlags method, of class FuzzyTask.
     */
    @Test
    public void testGetJobFlags() {
        System.out.println("getJobFlags");
        FuzzyTask instance = new FuzzyTaskImpl();
        boolean[] expResult = null;
        boolean[] result = instance.getJobFlags();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobFlags method, of class FuzzyTask.
     */
    @Test
    public void testSetJobFlags() {
        System.out.println("setJobFlags");
        boolean[] jobFlags = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.setJobFlags(jobFlags);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobData method, of class FuzzyTask.
     */
    @Test
    public void testGetJobData() {
        System.out.println("getJobData");
        FuzzyTask instance = new FuzzyTaskImpl();
        String expResult = "";
        String result = instance.getJobData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRules method, of class FuzzyTask.
     */
    @Test
    public void testGetRules() {
        System.out.println("getRules");
        FuzzyTask instance = new FuzzyTaskImpl();
        FuzzyRuleLookupTable expResult = null;
        FuzzyRuleLookupTable result = instance.getRules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRules method, of class FuzzyTask.
     */
    @Test
    public void testSetRules() {
        System.out.println("setRules");
        FuzzyRuleLookupTable rules = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.setRules(rules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of solve method, of class FuzzyTask.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        Graphics g = null;
        float[] exactValues = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        float expResult = 0.0F;
        float result = instance.solve(g, exactValues);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUoD method, of class FuzzyTask.
     */
    @Test
    public void testGetUoD() {
        System.out.println("getUoD");
        LinguisticVariable var = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        float[] expResult = null;
        float[] result = instance.getUoD(var);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawGraphic method, of class FuzzyTask.
     */
    @Test
    public void testDrawGraphic() {
        System.out.println("drawGraphic");
        LinguisticVariable var = null;
        Graphics g = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.drawGraphic(var, g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawFuzzyFunction method, of class FuzzyTask.
     */
    @Test
    public void testDrawFuzzyFunction() {
        System.out.println("drawFuzzyFunction");
        FuzzyPart function = null;
        float[] uod = null;
        Graphics g = null;
        Color color = null;
        int height = 0;
        int width = 0;
        int left_offset = 0;
        int bottom_offset = 0;
        int left_space = 0;
        int bottom_space = 0;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.drawFuzzyFunction(function, uod, g, color, height, width, left_offset, bottom_offset, left_space, bottom_space);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuzzyForExactValue method, of class FuzzyTask.
     */
    @Test
    public void testGetFuzzyForExactValue() {
        System.out.println("getFuzzyForExactValue");
        float exactValue = 0.0F;
        LinguisticVariable var = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        List expResult = null;
        List result = instance.getFuzzyForExactValue(exactValue, var);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawGraphicWithExactValue method, of class FuzzyTask.
     */
    @Test
    public void testDrawGraphicWithExactValue() {
        System.out.println("drawGraphicWithExactValue");
        LinguisticVariable var = null;
        Graphics g = null;
        float exactValue = 0.0F;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.drawGraphicWithExactValue(var, g, exactValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCompleteGraphic method, of class FuzzyTask.
     */
    @Test
    public void testDrawCompleteGraphic() {
        System.out.println("drawCompleteGraphic");
        LinguisticVariable var = null;
        Graphics g = null;
        float exactValue = 0.0F;
        FuzzyTask instance = new FuzzyTaskImpl();
        instance.drawCompleteGraphic(var, g, exactValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateEffectiveDegree method, of class FuzzyTask.
     */
    @Test
    public void testCalculateEffectiveDegree() {
        System.out.println("CalculateEffectiveDegree");
        LinguisticVariable var = null;
        float exactValue = 0.0F;
        FuzzyTask instance = new FuzzyTaskImpl();
        List expResult = null;
        List result = instance.CalculateEffectiveDegree(var, exactValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinguisticVariableExcludedFrom method, of class FuzzyTask.
     */
    @Test
    public void testGetLinguisticVariableExcludedFrom() {
        System.out.println("getLinguisticVariableExcludedFrom");
        LinguisticVariable[] vars = null;
        FuzzyTask instance = new FuzzyTaskImpl();
        LinguisticVariable expResult = null;
        LinguisticVariable result = instance.getLinguisticVariableExcludedFrom(vars);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class FuzzyTaskImpl extends FuzzyTask {

        public float solve(Graphics g, float[] exactValues) {
            return 0.0F;
        }
    }

}