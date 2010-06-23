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
        float slope_1 = 1 / (getHighestPoint() - getMinimum());
        float slope_2 = 1 / (getMaximum() - getHighestPoint());
        float[] result = new float[2];
        result[0] = y / slope_1;
        result[1] = y / slope_2;
        return result;
    }

    public float getY(float x) {
        if (x > getHighestPoint()) {
            float slope = 1 / (getMaximum() - getHighestPoint());
            return x * slope;
        } else if (x < getHighestPoint()) {
            float slope = 1 / (getHighestPoint() - getMinimum());
            return x * slope;
        } else {
            return 1;
        }
    }

    public float getCenter() {
        return ((getMaximum() - getMinimum()) / 2.0f);
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
        for (int i = 0; i < points.size(); i++) {
            if (exactValue == points.get(i)[0]) {
                return true;
            }
        }
        return false;
    }

    public float getTrivialResult(float exactValue) {
        if (isTrivial(exactValue)) {
            for (int i = 0; i < points.size(); i++) {
                if (exactValue == points.get(i)[0]) {
                    return points.get(i)[1];
                }
            }
        }
        return -1f;
    }

    public float getHighestPoint() {
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i)[1] == 1) {
                return points.get(i)[0];
            }
        }
        return -1f;
    }
}
