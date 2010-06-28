package testing;

/**
 *
 * @author malygos
 */
public class CompleteClassTest extends BasicTest {

    private static Class self = CompleteClassTest.class;

    public static boolean RunTest() {
        setHasOutput(false);
        try {
            if (Test4FuzzyResult.isHasOutput()) {
                System.out.println("Running test \"FuzzyResult\": ");
            } else {
                System.out.print("Running test \"FuzzyResult\": ");
            }
            boolean FuzzyResultOK = Test4FuzzyResult.RunTest();
            System.out.println("[" + (FuzzyResultOK ? "OK" : "Failed") + "]");

            System.out.print("Running test \"FuzzyRule\": ");
            boolean FuzzyRuleOK = Test4FuzzyRule.RunTest();
            System.out.println("[" + (FuzzyRuleOK ? "OK" : "Failed") + "]");

            System.out.print("Running test \"FuzzyRuleLookupTable\": ");
            boolean FuzzyRuleLUTOK = Test4FuzzyRuleLookupTable.RunTest();
            System.out.println("[" + (FuzzyRuleLUTOK ? "OK" : "Failed") + "]");

            System.out.print("Running test \"LinguisticVariable\": ");
            boolean LinguisticVarOK = Test4LinguisticVariable.RunTest();
            System.out.println("[" + (LinguisticVarOK ? "OK" : "Failed") + "]");

            assert FuzzyResultOK;
            assert FuzzyRuleLUTOK;
            assert FuzzyRuleOK;
            assert LinguisticVarOK;

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
