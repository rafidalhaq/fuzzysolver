/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.FuzzyResult;

/**
 *
 * @author malygos
 */
public class Test4FuzzyResult extends BasicTest{

    private static Class self = Test4FuzzyResult.class;

    public static boolean RunTest() {
        setHasOutput(false);
        try {
            FuzzyResult fr = new FuzzyResult();
            FuzzyPart part = new FuzzyPart();
            List<float[]> points = new ArrayList<float[]>();
            points.add(new float[]{1f,0f});
            points.add(new float[]{5f,1f});
            points.add(new float[]{10f,0f});
            part.setName("part");
            part.setPoints(points);
            fr.setPart(part);
            fr.setExactValue(5f);
            fr.setEffectiveDegree(1f);

            assert(fr.getPart().equals(part));
            assert(fr.getExactValue() == 5f);
            assert(fr.getEffectiveDegree()==1f);
            
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
