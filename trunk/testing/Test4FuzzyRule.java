/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.FuzzyRule;

/**
 *
 * @author malygos
 */
public class Test4FuzzyRule {

    private static Class self = Test4FuzzyRule.class;

    public static boolean RunTest() {
        try {
            FuzzyRule fr = new FuzzyRule();

            FuzzyPart condition_1 = new FuzzyPart();
            FuzzyPart condition_2 = new FuzzyPart();
            FuzzyPart result = new FuzzyPart();

            List<float[]> points = new ArrayList<float[]>();
            points.add(new float[]{0f, 1f});
            points.add(new float[]{5f, 0f});

            condition_1.setPoints(points);
            condition_2.setPoints(points);
            result.setPoints(points);

            String[] rule = new String[]{"high", "normal", "low"};

            condition_1.setName("cond1");
            condition_2.setName("cond2");
            result.setName("result");

            fr.setCondition(new FuzzyPart[]{condition_1, condition_2});
            fr.setResult(result);
            fr.setCond_effectivity(new float[]{0.27f, 0.33f});
            fr.setResult_effectivity(0.27f);

            fr.setRule(rule);

            System.out.println(fr.toString());

            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(self.getName());
        if (RunTest())
            System.out.println("Test successful.");
        else
            System.out.println("Test failed");
    }
}
