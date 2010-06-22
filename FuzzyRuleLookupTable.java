/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzysolver;

import java.util.List;

/**
 *
 * @author malygos
 */
public class FuzzyRuleLookupTable {
    private LinguisticVariable top;
    private LinguisticVariable left;
    private List<String[]> ruleSet;

    /**
     * @return the top
     */
    public LinguisticVariable getTop() {
        return top;
    }

    /**
     * @param top the top to set
     */
    public void setTop(LinguisticVariable top) {
        this.top = top;
    }

    /**
     * @return the left
     */
    public LinguisticVariable getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(LinguisticVariable left) {
        this.left = left;
    }

    /**
     * @return the ruleSet
     */
    public List<String[]> getRuleSet() {
        return ruleSet;
    }

    /**
     * @param ruleSet the ruleSet to set
     */
    public void setRuleSet(List<String[]> ruleSet) {
        this.ruleSet = ruleSet;
    }
}
