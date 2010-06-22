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
public class LinguisticVariable {

    private String name;
    private List<FuzzyPart> fuzzyParts;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fuzzyParts
     */
    public List<FuzzyPart> getFuzzyParts() {
        return fuzzyParts;
    }

    /**
     * @param fuzzyParts the fuzzyParts to set
     */
    public void setFuzzyParts(List<FuzzyPart> fuzzyParts) {
        this.fuzzyParts = fuzzyParts;
    }

}
