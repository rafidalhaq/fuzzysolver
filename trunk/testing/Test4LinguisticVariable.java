/* This class is a singleton-pattern class */
package testing;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.LinguisticVariable;

/**
 *
 * @author malygos
 */
public class Test4LinguisticVariable {

    private static Class self = Test4LinguisticVariable.class;

    public static boolean RunTest() {
        try {
            LinguisticVariable left = new LinguisticVariable();

            left.setName("left");

            FuzzyPart condition_1 = new FuzzyPart();
            FuzzyPart condition_2 = new FuzzyPart();

            List<float[]> points = new ArrayList<float[]>();
            points.add(new float[]{0f, 1f});
            points.add(new float[]{5f, 0f});

            condition_1.setPoints(points);
            condition_2.setPoints(points);
            condition_1.setName("cond1");
            condition_2.setName("cond2");

            List<FuzzyPart> parts_left;

            parts_left = new ArrayList<FuzzyPart>();
            parts_left.add(condition_1);
            parts_left.add(condition_2);

            left.setFuzzyParts(parts_left);

            List<FuzzyPart> parts = left.getFuzzyParts();
            String lv_Name = left.getName();
            FuzzyPart p1 = left.getPartByName("cond1");
            FuzzyPart p2 = left.getPartByName("cond2");

            assert (parts.equals(parts_left));
            assert (lv_Name.equals("left"));
            assert (p1.equals(condition_1));
            assert (p2.equals(condition_2));

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(self.getName());
        if (RunTest()) {
            System.out.println("Test successful.");
        } else {
            System.out.println("Test failed");
        }
    }
}
