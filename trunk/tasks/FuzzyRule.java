/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks;

/**
 *
 * @author malygos
 */
public class FuzzyRule {
    private FuzzyPart[] condition;
    private FuzzyPart result;
    private String[] rule;
    private float[] cond_effectivity;
    private float result_effectivity;

    /**
     * @return the condition
     */
    public FuzzyPart[] getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(FuzzyPart[] condition) {
        this.condition = condition;
    }

    /**
     * @return the result
     */
    public FuzzyPart getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(FuzzyPart result) {
        this.result = result;
    }

    /**
     * @return the rule
     */
    public String[] getRule() {
        return rule;
    }

    /**
     * @param rule the rule to set
     */
    public void setRule(String[] rule) {
        this.rule = rule;
    }

    /**
     * @return the cond_effectivity
     */
    public float[] getCond_effectivity() {
        return cond_effectivity;
    }

    /**
     * @param cond_effectivity the cond_effectivity to set
     */
    public void setCond_effectivity(float[] cond_effectivity) {
        this.cond_effectivity = cond_effectivity;
    }

    /**
     * @return the result_effectivity
     */
    public float getResult_effectivity() {
        return result_effectivity;
    }

    /**
     * @param result_effectivity the result_effectivity to set
     */
    public void setResult_effectivity(float result_effectivity) {
        this.result_effectivity = result_effectivity;
    }

    @Override
    public String toString(){
        String s="IF ";
        for (int i=0; i<condition.length; i++)
        {
            s += condition[i].getName()+" IS "+rule[i]+" ("+cond_effectivity[i]+") ";
            if (i < condition.length -1 )
                s += " AND ";
        }
        s += " THEN "+result.getName()+" IS "+rule[rule.length-1]+" ("+result_effectivity+")";
        return s;
    }
}
