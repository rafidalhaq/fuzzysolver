/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author malygos
 */
public class FuzzyResult {

    private FuzzyPart part;
    private float exactValue;
    private float effectiveDegree;

    /**
     * @return the part
     */
    public FuzzyPart getPart() {
        return part;
    }

    /**
     * @param part the part to set
     */
    public void setPart(FuzzyPart part) {
        this.part = part;
    }

    /**
     * @return the exactValue
     */
    public float getExactValue() {
        return exactValue;
    }

    /**
     * @param exactValue the exactValue to set
     */
    public void setExactValue(float exactValue) {
        this.exactValue = exactValue;
    }

    /**
     * @return the effectiveDegree
     */
    public float getEffectiveDegree() {
        return effectiveDegree;
    }

    /**
     * @param effectiveDegree the effectiveDegree to set
     */
    public void setEffectiveDegree(float effectiveDegree) {
        this.effectiveDegree = effectiveDegree;
    }
}
