/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

/**
 *
 * @author malygos
 */
public class Trapez {

    private float[][] points;
    private boolean isOrdered;

    public Trapez(float[] p0, float[] p1, float[] p2) {
        isOrdered = false;
        points = new float[3][2];
        int length_p0, length_p1, length_p2;
        length_p0 = p0.length;
        length_p1 = p1.length;
        length_p2 = p2.length;
        assert length_p0 == 2;
        assert length_p1 == 2;
        assert length_p2 == 2;
        addPoint(0, p0);
        addPoint(1, p1);
        addPoint(2, p2);
    }

    public Trapez(float[] p0, float[] p1, float[] p2, float[] p3) {
        isOrdered = false;
        points = new float[4][2];
        int length_p0, length_p1, length_p2, length_p3;
        length_p0 = p0.length;
        length_p1 = p1.length;
        length_p2 = p2.length;
        length_p3 = p3.length;

        assert length_p0 == 2;
        assert length_p1 == 2;
        assert length_p2 == 2;
        assert length_p3 == 2;

        assert p1[1] == p2[1];

        addPoint(0, p0);
        addPoint(1, p1);
        addPoint(2, p2);
        addPoint(3, p3);
    }

    public float getY(float x) {
//        if (!isOrdered) {
//            order();
//        }

        float min = getMinX();
        float max = getMaxX();

        if (x < min || x > max) {
            return Float.MIN_VALUE;     //error
        }
        float y = 0f;
        if (points.length == 3) {
            if (x > points[0][0] && x < points[1][0]) {
                y = (points[1][1] - points[0][1]) / (x - points[0][0]);

            } else if (x > points[1][0] && x < points[2][0]) {
                y = (points[2][1] - points[1][1]) / (points[2][0] - x);
            } else if (x == points[1][0]) {
                y = points[1][1];
            }
        } else if (points.length == 4) {
            if (x > points[0][0] && x < points[1][0]) {
                y = (points[1][1] - points[0][1]) / (x - points[0][0]);

            } else if (x > points[2][0] && x < points[3][0]) {
                y = (points[3][1] - points[2][1]) / (points[3][0] - x);
            } else if (x >= points[1][0] && x <= points[2][0]) {
                y = points[1][1];
            }
        }

        if (y < 0) {
            y = 1 + y;
        }

        return y;

    }

    private void addPoint(int i, float[] p0) {
        assert (i >= 0);
        assert (i < points.length);
        assert (p0.length == 2);
        points[i][0] = p0[0];
        points[i][1] = p0[1];
    }

    private float getMaxX() {
        assert points != null;
        assert points.length > 0;

        float max = 0f;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > max) {
                max = points[i][0];
            }
        }
        return max;
    }

    private float getMinX() {
        assert points != null;
        assert points.length > 0;

        float min = 0f;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < min) {
                min = points[i][0];
            }
        }
        return min;
    }

    private void order() {
        float[][] tmp = new float[points.length][];
        for (int i = 0; i < points.length; i++) {
            tmp[i] = new float[points[i].length];
        }

        float min = getMinX();
        float max = getMaxX();
        float lastMin = min;
        int tmpID = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == lastMin) {
                tmp[tmpID][0] = min;
                tmp[tmpID][1] = points[i][1];
                tmpID++;

                for (int j = 0; j < points.length; j++) {
                    if ((points[j][0] > lastMin) && (points[j][0] < max)) {
                        lastMin = points[j][0];
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            points[i][0] = tmp[i][0];
            points[i][1] = tmp[i][1];
        }
        isOrdered = true;
    }
}
