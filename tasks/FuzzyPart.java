/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.List;

/**
 *
 * @author malygos
 */
public class FuzzyPart {

    private String name;
    private List<float[]> points;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the points
     */
    public List<float[]> getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(List<float[]> points) {
        this.points = points;
    }

    public float getMinimum() {
        float min = points.get(0)[0];
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i)[0] < min) {
                min = points.get(i)[0];
            }
//            if (points.get(i)[1] < min) {
//                min = points.get(i)[0];
//            }
        }
        return min;
    }

    public float getMaximum() {
        float max = points.get(0)[0];
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i)[0] > max) {
                max = points.get(i)[0];
            }
//            if (points.get(i)[1] > max) {
//                max = points.get(i)[0];
//            }
        }
        return max;
    }

    public float[] getX(float y) {
        float[] highest = getHighestPoint();
        float max = getMaximum();
        float min = getMinimum();

        float[] slopes = new float[highest.length == 1 ? 2 : highest.length];

        if (highest.length == 1) {
            slopes[0] = 1 / (highest[0] - min);
            slopes[1] = -1 / (max - highest[0]);
        } else {
            for (int i = 0; i < highest.length; i++) {
                slopes[i] = 1 / (highest[i] - (i == 0 ? min : max));
            }
        }

        float[] xe = new float[slopes.length];
        for (int i = 0; i < slopes.length; i++) {
            if (slopes[i] > 0) {
                xe[i] = y / slopes[i];
            } else {
                xe[i] = max + (y / slopes[i]);
            }
        }
        return xe;
    }

    public float getY(float x) {

        float[] highest = getHighestPoint();
        float min = getMinimum();
        float max = getMaximum();

        float[] slopes = new float[highest.length == 1 ? 2 : highest.length];

        if (highest.length == 1) {
            slopes[0] = 1 / (highest[0] - min);
            slopes[1] = -1 / (max - highest[0]);
        } else {
            for (int i = 0; i < highest.length; i++) {
                slopes[i] = 1 / (highest[i] - (i == 0 ? min : max));
            }
        }

        for (int i = 0; i < highest.length; i++) {
            if (0 <= x && x <= highest[i]) {
                if (slopes[i] > 0) {
                    return x * slopes[i];
                } else {
                    return 1 - (x * slopes[i]);
                }
            } else if (highest[i] <= x && x <= max) {
                if (slopes[i] > 0) {
                    return x * slopes[i];
                } else {
                    return 1 - (x * slopes[i]);
                }
            } else {
                return 1;
            }

        }

        return -1f;

    }

    public float getCenter() {
        //return ((getMaximum() - getMinimum()) / 2.0f);
        float[] highest = getHighestPoint();
        if (highest.length == 1)
            return highest[0];
        else if (highest.length == 2)
            return (highest[0]+(highest[1]-highest[0])/2.0f);
        else
            return -1f;
    }

    public boolean isInPart(float exactValue) {
        float min = getMinimum();
        float max = getMaximum();
        if (exactValue >= getMinimum() && exactValue <= getMaximum()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTrivial(float exactValue) {
        for (int i = 0; i
                < points.size(); i++) {
            if (exactValue == points.get(i)[0]) {
                return true;
            }
        }
        return false;
    }

    public float getTrivialResult(float exactValue) {
        if (isTrivial(exactValue)) {
            for (int i = 0; i
                    < points.size(); i++) {
                if (exactValue == points.get(i)[0]) {
                    return points.get(i)[1];
                }
            }
        }
        return -1f;
    }

    public float[] getHighestPoint() {
        float[] fpoints = null;
        int counter = 0;
        for (int i = 0; i
                < points.size(); i++) {
            if (points.get(i)[1] == 1) {
                counter++;
            }
        }

        if (counter > 0) {
            fpoints = new float[counter];
        }

        int pid = 0;

        for (int i = 0; i < points.size(); i++) {
            if (points.get(i)[1] == 1) {
                fpoints[pid++] = points.get(i)[0];
            }
        }
        return fpoints;
    }
}
