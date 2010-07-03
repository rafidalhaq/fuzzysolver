/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import math.Trapez;

/**
 *
 * @author malygos
 */
public class FuzzyPart extends Trapez{

    private String name;


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



    public float getMinimum() {
        return this.getMinX();

    }

    public float getMaximum() {
        return this.getMaxX();

    }

    public float getCenter() {
        return this.getCenterOfMaximum();
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

    public float[][] getHighestPoint() {
        return this.getMaximumArea();
    }
}
