/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing geometric figure of trapez.
 * Note that points have to be defined in an ordered fashion,
 * it is recommended to define them from left to right.
 * @author malygos
 */
public class PartGeometry {

    private float[][] points;
    private boolean isOrdered;

    public PartGeometry() {
    }

    /**
     * Sometimes some part in fuzzy tasks is represented by a single line.      
     * @param p0
     * @param p1     
     */
    public PartGeometry(float[] p0, float[] p1) {
        isOrdered = false;
        points = new float[2][2];
        int length_p0, length_p1, length_p2;
        length_p0 = p0.length;
        length_p1 = p1.length;

        assert length_p0 == 2;
        assert length_p1 == 2;

        addPoint(0, p0);
        addPoint(1, p1);

    }

    /**
     * Triangular representation of a fuzzy part
     * @param p0
     * @param p1
     * @param p2
     */
    public PartGeometry(float[] p0, float[] p1, float[] p2) {
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

    /**
     * Trapeze representation of a fuzzy part
     * @param p0
     * @param p1
     * @param p2
     * @param p3
     */
    public PartGeometry(float[] p0, float[] p1, float[] p2, float[] p3) {
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

    private boolean isLine() {
        assert points != null;
        assert points.length > 0;
        return points.length == 2;
    }

    private boolean isTriangle() {
        assert points != null;
        assert points.length > 0;
        return points.length == 3;
    }

    private boolean isTrapeze() {
        assert points != null;
        assert points.length > 0;
        return points.length == 4;
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
        if (isLine()) {
            y = (getPoints()[1][1] - getPoints()[0][1]) / (x - getPoints()[0][0]);
        } else if (isTriangle()) {
            if (x > getPoints()[0][0] && x < getPoints()[1][0]) {
                y = (getPoints()[1][1] - getPoints()[0][1]) / (x - getPoints()[0][0]);

            } else if (x > getPoints()[1][0] && x < getPoints()[2][0]) {
                y = (getPoints()[2][1] - getPoints()[1][1]) / (getPoints()[2][0] - x);
            } else if (x == getPoints()[1][0]) {
                y = getPoints()[1][1];
            }
        } else if (isTrapeze()) {
            if (x > getPoints()[0][0] && x < getPoints()[1][0]) {
                y = (getPoints()[1][1] - getPoints()[0][1]) / (x - getPoints()[0][0]);

            } else if (x > getPoints()[2][0] && x < getPoints()[3][0]) {
                y = (getPoints()[3][1] - getPoints()[2][1]) / (getPoints()[3][0] - x);
            } else if (x >= getPoints()[1][0] && x <= getPoints()[2][0]) {
                y = getPoints()[1][1];
            }
        }

        if (y < 0) {
            y = 1 + y;
        }

        return y;

    }

    public float[] getX(float y) {
        assert getPoints() != null;
        assert getPoints().length > 0;
        if (y == getMaxY()) {
            if (isLine()) {
                for (int i = 0; i < getPoints().length; i++) {
                    if (getPoints()[i][1] == y) {
                        return new float[]{getPoints()[i][0]};
                    }
                }
                return null;
            }
            if (isTriangle()) {
                for (int i = 0; i < getPoints().length; i++) {
                    if (getPoints()[i][1] == y) {
                        return new float[]{getPoints()[i][0]};
                    }
                }
                return null;
            } else if (isTrapeze()) {
                float[] xe = new float[2];
                int pid = 0;
                for (int i = 0; i < getPoints().length; i++) {
                    if (getPoints()[i][1] == y) {
                        xe[pid] = getPoints()[i][0];
                        pid++;
                    }
                }
                return xe;
            } else {
                return null;
            }
        } else {
            if (isLine()) {
                float slope1 = (getPoints()[1][1] - getPoints()[0][1]) / (getPoints()[1][0] - getPoints()[0][0]);
                float[] result = new float[1];                
                result[0] = slope1 > 0 ? getPoints()[0][0] + (y / slope1) : getPoints()[0][0] - (y / slope1);
                return result;
            } else if (isTriangle()) {
                float slope1 = (getPoints()[1][1] - getPoints()[0][1]) / (getPoints()[1][0] - getPoints()[0][0]);
                float slope2 = (getPoints()[2][1] - getPoints()[1][1]) / (getPoints()[2][0] - getPoints()[1][0]);
                float[] result = new float[2];
                result[0] = slope1 > 0 ? getPoints()[0][0] + (y / slope1) : getPoints()[0][0] - (y / slope1);
                result[1] = slope1 > 0 ? getPoints()[2][0] - (y / slope2) : getPoints()[2][0] + (y / slope2);
                return result;
            } else if (isTrapeze()) {
                float slope1 = (getPoints()[1][1] - getPoints()[0][1]) / (getPoints()[1][0] - getPoints()[0][0]);
                float slope2 = (getPoints()[3][1] - getPoints()[2][1]) / (getPoints()[3][0] - getPoints()[2][0]);
                float[] result = new float[2];
                result[0] = slope1 > 0 ? getPoints()[0][0] + (y / slope1) : getPoints()[0][0] - (y / slope1);
                result[1] = slope2 > 0 ? getPoints()[3][0] - (y / slope2) : getPoints()[3][0] + (y / slope2);
                return result;
            } else {
                return null;
            }
        }
    }

    public float[][] getMaximumArea() {
        assert getPoints() != null;
        assert getPoints().length > 0;

        List<float[]> areaPoints = new ArrayList<float[]>();
        for (int i = 0; i < getPoints().length; i++) {
            if (getPoints()[i][1] == getMaxY()) {
                areaPoints.add(getPoints()[i]);
            }
        }

        float[][] result = new float[areaPoints.size()][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new float[2];
            result[i][0] = areaPoints.get(i)[0];
            result[i][1] = areaPoints.get(i)[1];
        }
        return result;

    }

    public float getCenterOfMaximum() {
        float[][] maxArea = getMaximumArea();
        assert maxArea.length == 2;
        float left = maxArea[0][0];
        float right = maxArea[1][0];
        return right - ((right - left) / 2);
    }

    private void addPoint(int i, float[] p0) {
        assert (i >= 0);
        assert (i < getPoints().length);
        assert (p0.length == 2);
        points[i][0] = p0[0];
        points[i][1] = p0[1];
    }

    public float getMaxX() {
        assert getPoints() != null;
        assert getPoints().length > 0;

        float max = 0f;
        for (int i = 0; i < getPoints().length; i++) {
            if (getPoints()[i][0] > max) {
                max = getPoints()[i][0];
            }
        }
        return max;
    }

    public float getMinX() {
        assert getPoints() != null;
        assert getPoints().length > 0;

        float min = 0f;
        for (int i = 0; i < getPoints().length; i++) {
            if (getPoints()[i][0] < min) {
                min = getPoints()[i][0];
            }
        }
        return min;
    }

    public float getMaxY() {
        assert getPoints() != null;
        assert getPoints().length > 0;

        float max = 0f;
        for (int i = 0; i < getPoints().length; i++) {
            if (getPoints()[i][1] > max) {
                max = getPoints()[i][1];
            }
        }
        return max;
    }

    public void order() {

        java.util.Arrays.sort(getPoints());
        java.util.Arrays.toString(getPoints());

    }

    public boolean isTrivial(float exactValue) {
        for (int i = 0; i < getPoints().length; i++) {
            if (exactValue == getPoints()[i][0]) {
                return true;
            }
        }
        return false;
    }

    public float getTrivialResult(float exactValue) {
        if (isTrivial(exactValue)) {
            for (int i = 0; i < getPoints().length; i++) {
                if (exactValue == getPoints()[i][0]) {
                    return getPoints()[i][1];
                }
            }
        }
        return -1f;
    }

    /**
     * @return the points
     */
    public float[][] getPoints() {
        return points;
    }
}
