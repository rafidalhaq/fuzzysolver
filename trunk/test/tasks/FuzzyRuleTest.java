/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks;

import java.util.ArrayList;
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
public class FuzzyRuleTest {

    public FuzzyRuleTest() {
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
     * Test of getCondition method, of class FuzzyRule.
     */
    @Test
    public void testGetCondition() {
        System.out.println("getCondition");
        FuzzyRule instance = new FuzzyRule();
        FuzzyPart fp = new FuzzyPart();
        fp.setName("test");
        List<float[]> points = new ArrayList<float[]>();
        points.add(new float[]{0f,1f});
        points.add(new float[]{1f,0f});
        fp.setPoints(points);
        instance.setCondition(new FuzzyPart[]{fp});
        FuzzyPart[] expResult = new FuzzyPart[]{fp};
        FuzzyPart[] result = instance.getCondition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCondition method, of class FuzzyRule.
     */
    @Test
    public void testSetCondition() {
        System.out.println("setCondition");
        FuzzyPart fp = new FuzzyPart();
        fp.setName("test");
        List<float[]> points = new ArrayList<float[]>();
        points.add(new float[]{0f,1f});
        points.add(new float[]{1f,0f});
        fp.setPoints(points);
        FuzzyRule instance = new FuzzyRule();
        instance.setCondition(new FuzzyPart[]{fp});
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class FuzzyRule.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        FuzzyRule instance = new FuzzyRule();

        FuzzyPart fp = new FuzzyPart();
        fp.setName("test");
        List<float[]> points = new ArrayList<float[]>();
        points.add(new float[]{0f,1f});
        points.add(new float[]{1f,0f});
        fp.setPoints(points);
        instance.setResult(fp);

        FuzzyPart expResult = fp;
        FuzzyPart result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class FuzzyRule.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        FuzzyPart fp = new FuzzyPart();
        fp.setName("test");
        List<float[]> points = new ArrayList<float[]>();
        points.add(new float[]{0f,1f});
        points.add(new float[]{1f,0f});
        fp.setPoints(points);
        FuzzyRule instance = new FuzzyRule();
        instance.setResult(fp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRule method, of class FuzzyRule.
     */
    @Test
    public void testGetRule() {
        System.out.println("getRule");
        FuzzyRule instance = new FuzzyRule();
        instance.setRule(new String[]{"high","normal","low"});
        String[] expResult = new String[]{"high","normal","low"};
        String[] result = instance.getRule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRule method, of class FuzzyRule.
     */
    @Test
    public void testSetRule() {
        System.out.println("setRule");
        String[] rule = new String[]{"high","normal","low"};
        FuzzyRule instance = new FuzzyRule();
        instance.setRule(rule);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCond_effectivity method, of class FuzzyRule.
     */
    @Test
    public void testGetCond_effectivity() {
        System.out.println("getCond_effectivity");
        FuzzyRule instance = new FuzzyRule();
        float[] points = new float[]{0.34f,0.67f};
        instance.setCond_effectivity(points);
        float[] expResult = points;
        float[] result = instance.getCond_effectivity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCond_effectivity method, of class FuzzyRule.
     */
    @Test
    public void testSetCond_effectivity() {
        System.out.println("setCond_effectivity");
        float[] cond_effectivity = new float[]{0,34f,0,67f};
        FuzzyRule instance = new FuzzyRule();
        instance.setCond_effectivity(cond_effectivity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getResult_effectivity method, of class FuzzyRule.
     */
    @Test
    public void testGetResult_effectivity() {
        System.out.println("getResult_effectivity");
        FuzzyRule instance = new FuzzyRule();
        instance.setResult_effectivity(0.376f);
        float expResult = 0.376F;
        float result = instance.getResult_effectivity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setResult_effectivity method, of class FuzzyRule.
     */
    @Test
    public void testSetResult_effectivity() {
        System.out.println("setResult_effectivity");
        float result_effectivity = 0.0F;
        FuzzyRule instance = new FuzzyRule();
        instance.setResult_effectivity(result_effectivity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class FuzzyRule.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FuzzyRule instance = new FuzzyRule();

        FuzzyPart fp = new FuzzyPart();
        fp.setName("cond_1");
        List<float[]> points = new ArrayList<float[]>();
        points.add(new float[]{0f,1f});
        points.add(new float[]{1f,0f});
        fp.setPoints(points);

        FuzzyPart fp2 = new FuzzyPart();
        fp2.setName("cond_2");
        List<float[]> points2 = new ArrayList<float[]>();
        points2.add(new float[]{0f,1f});
        points2.add(new float[]{1f,0f});
        fp2.setPoints(points2);

        FuzzyPart res = new FuzzyPart();
        res.setName("res");
        List<float[]> pointsr = new ArrayList<float[]>();
        pointsr.add(new float[]{0f,1f});
        pointsr.add(new float[]{1f,0f});
        res.setPoints(pointsr);

        instance.setCondition(new FuzzyPart[]{fp,fp2});
        instance.setCond_effectivity(new float[]{0.33f,0.27f});
        instance.setResult(res);
        instance.setResult_effectivity(0.27f);
        instance.setRule(new String[]{"high","normal","low"});

        String expResult = "IF cond_1 IS high (0.33) AND cond_2 IS normal (0.27) THEN res IS low (0.27)";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}