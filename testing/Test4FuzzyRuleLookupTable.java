package testing;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.FuzzyRuleLookupTable;
import tasks.LinguisticVariable;

/**
 *
 * @author malygos
 */
public class Test4FuzzyRuleLookupTable {

    private static Class self = Test4FuzzyRuleLookupTable.class;

    public static boolean RunTest() {
        try {
            FuzzyRuleLookupTable lutab = new FuzzyRuleLookupTable();
            LinguisticVariable left = new LinguisticVariable();
            LinguisticVariable top = new LinguisticVariable();
            left.setName("left");
            top.setName("top");
            List<String[]> ruleTable = new ArrayList<String[]>();
            ruleTable.add(new String[]{"high", "low", "normal"});
            ruleTable.add(new String[]{"high", "normal", "normal"});
            ruleTable.add(new String[]{"high", "high", "high"});
            ruleTable.add(new String[]{"low", "low", "normal"});

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

            List<FuzzyPart> parts_left, parts_top;
            parts_left = new ArrayList<FuzzyPart>();
            parts_top = new ArrayList<FuzzyPart>();

            parts_left.add(condition_1);
            parts_left.add(condition_2);

            parts_top.add(condition_2);
            parts_top.add(result);

            left.setFuzzyParts(parts_left);
            top.setFuzzyParts(parts_top);

            lutab.setLeft(left);
            lutab.setTop(top);
            lutab.setRuleSet(ruleTable);
            lutab.setAndConnection(true);


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
