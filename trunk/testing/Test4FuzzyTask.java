package testing;

import java.util.List;
import tasks.FuzzyResult;
import tasks.LinguisticVariable;
import tasks.buildin.OelVerbrauch;

/**
 *
 * @author malygos
 */
public class Test4FuzzyTask {

    private static Class self = Test4FuzzyTask.class;

    public static boolean RunTest() {

        try {
            OelVerbrauch verbrauch = new OelVerbrauch();
            System.out.println(verbrauch.getName());
            System.out.println(verbrauch.getLinguisticVariables().size());
            for (int i = 0; i < verbrauch.getLinguisticVariables().size(); i++) {
                System.out.println(verbrauch.getLinguisticVariables().get(i).getName());

            }
            LinguisticVariable lv = verbrauch.getLinguisticVariableExcludedFrom(
                    new LinguisticVariable[]{verbrauch.getLinguisticVariables().get(0),
                        verbrauch.getLinguisticVariables().get(1)});
            assert lv != null;
            System.out.println("remaining lv: "+lv.getName());
            System.out.println("lv[0]: "+verbrauch.getLinguisticVariables().get(0).getName());
            System.out.println("lv[1]: "+verbrauch.getLinguisticVariables().get(1).getName());
            System.out.println("lv[2]: "+verbrauch.getLinguisticVariables().get(2).getName());
            for (int i=0; i<verbrauch.getLinguisticVariables().size();i++)
            {
                LinguisticVariable _lv = verbrauch.getLinguisticVariables().get(i);
                float[] uod = verbrauch.getUoD(_lv);
                assert uod.length == 2;
                System.out.println("lv["+i+"].UoD = ["+uod[0]+","+uod[1]+"]");
                List<FuzzyResult> ex_x0 = verbrauch.CalculateEffectiveDegree(_lv, 0f);
                for (int fr = 0; fr < ex_x0.size(); fr++){
                    FuzzyResult r = ex_x0.get(fr);
                    System.out.println(r.getPart().getName()+": value = "+r.getExactValue()+"; µ = "+r.getEffectiveDegree());
                }

            }

            verbrauch.solve(null, new float[]{18f,28f});

            for (int i=0; i<lv.getFuzzyParts().size(); i++){
                System.out.println(lv.getFuzzyParts().get(i).getName());
                System.out.println(lv.getFuzzyParts().get(i).getPoints().size());
                for (int p=0; p<lv.getFuzzyParts().get(i).getPoints().size(); p++)
                {
                    float[] point = lv.getFuzzyParts().get(i).getPoints().get(p);
                    System.out.println("["+point[0]+","+point[1]+"]");
                }
            }


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
