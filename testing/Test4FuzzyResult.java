/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author malygos
 */
public class Test4FuzzyResult {

    private static Class self = Test4FuzzyResult.class;

    public static boolean RunTest() {
        return false;
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
