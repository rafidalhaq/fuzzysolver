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
public class FuzzyRuleLookupTableTest {

    public FuzzyRuleLookupTableTest() {
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
     * Test of getTop method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testGetTop() {
        System.out.println("getTop");
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        LinguisticVariable expResult = null;
        LinguisticVariable result = instance.getTop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTop method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testSetTop() {
        System.out.println("setTop");
        LinguisticVariable top = null;
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        instance.setTop(top);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeft method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testGetLeft() {
        System.out.println("getLeft");
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        LinguisticVariable expResult = null;
        LinguisticVariable result = instance.getLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLeft method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        LinguisticVariable left = null;
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        instance.setLeft(left);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuleSet method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testGetRuleSet() {
        System.out.println("getRuleSet");
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        List expResult = null;
        List result = instance.getRuleSet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRuleSet method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testSetRuleSet() {
        System.out.println("setRuleSet");
        List<String[]> ruleSet = null;
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        instance.setRuleSet(ruleSet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAndConnection method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testSetAndConnection() {
        System.out.println("setAndConnection");
        boolean andConnection = false;
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        instance.setAndConnection(andConnection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAndConnection method, of class FuzzyRuleLookupTable.
     */
    @Test
    public void testIsAndConnection() {
        System.out.println("isAndConnection");
        FuzzyRuleLookupTable instance = new FuzzyRuleLookupTable();
        boolean expResult = false;
        boolean result = instance.isAndConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}