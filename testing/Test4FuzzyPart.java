package testing;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;

/**
 *
 * @author malygos
 */
public class Test4FuzzyPart extends BasicTest {

    private static Class self = Test4FuzzyPart.class;

    public static boolean RunTest() {
        setHasOutput(true);
        try {
            FuzzyPart part = new FuzzyPart();
            part.setName("part");

            List<float[]> points = new ArrayList<float[]>();
            points.add(new float[]{0f, 0f});
            points.add(new float[]{10f, 1f});
            points.add(new float[]{15f, 1f});
            points.add(new float[]{20f, 0f});
            part.setPoints(points);

            float center = part.getCenter();
            float[] highest = part.getHighestPoint();
            float max = part.getMaximum();
            float min = part.getMinimum();
            float [] x = part.getX(1f);
            float y = part.getY(5f);

            System.out.println("Name: "+part.getName());
            System.out.println("Center: "+center);
            System.out.print("Highest points: ");
            for (int i=0; i<highest.length; i++)
                System.out.print(highest[i]+" ");
            System.out.println();
            System.out.println("Maximum: "+max);
            System.out.println("Minimum: "+min);
            assert x.length == 2;
            System.out.println("x(y=1): "+x[0]+", "+x[1]);
            System.out.println("y(x=5): "+y);

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
