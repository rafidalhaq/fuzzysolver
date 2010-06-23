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
