/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fuzzysolver;

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

}
