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
public class LinguisticVariableTest {

    public LinguisticVariableTest() {
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
     * Test of getName method, of class LinguisticVariable.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        LinguisticVariable instance = new LinguisticVariable();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class LinguisticVariable.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        LinguisticVariable instance = new LinguisticVariable();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFuzzyParts method, of class LinguisticVariable.
     */
    @Test
    public void testGetFuzzyParts() {
        System.out.println("getFuzzyParts");
        LinguisticVariable instance = new LinguisticVariable();
        List expResult = null;
        List result = instance.getFuzzyParts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFuzzyParts method, of class LinguisticVariable.
     */
    @Test
    public void testSetFuzzyParts() {
        System.out.println("setFuzzyParts");
        List<FuzzyPart> fuzzyParts = null;
        LinguisticVariable instance = new LinguisticVariable();
        instance.setFuzzyParts(fuzzyParts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPartByName method, of class LinguisticVariable.
     */
    @Test
    public void testGetPartByName() {
        System.out.println("getPartByName");
        String name = "";
        LinguisticVariable instance = new LinguisticVariable();
        FuzzyPart expResult = null;
        FuzzyPart result = instance.getPartByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}