/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.awt.Color;
import math.PartGeometry;

/**
 *
 * @author malygos
 */
public class FuzzyPart extends PartGeometry{

    private String name;
    private Color color;

    public FuzzyPart(String name, float[] p1, float[] p2)
    {
        super(p1,p2);
        this.name = name;
    }

    public FuzzyPart(String name, float[] p1, float[] p2, float[] p3)
    {
        super(p1,p2,p3);
        this.name = name;
    }

    public FuzzyPart(String name, float[] p1, float[] p2, float[] p3, float[] p4)
    {
        super(p1,p2,p3,p4);
        this.name = name;
    }

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

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
