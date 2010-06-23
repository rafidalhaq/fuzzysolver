/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks.buildin;

import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.FuzzyTask;
import tasks.LinguisticVariable;

/**
 *
 * @author malygos
 */
public class OelVerbrauch extends FuzzyTask{

    public OelVerbrauch(){
        super();
        setName("Ölverbrauch");
        setJobFlags(new boolean[]{true, true, true, true});
        LinguisticVariable temperatur, oelverbrauch, oelpreis;
        temperatur = new LinguisticVariable();
        oelpreis = new LinguisticVariable();
        oelverbrauch = new LinguisticVariable();
        temperatur.setName("Temperatur");
        oelpreis.setName("Ölpreis");
        oelverbrauch.setName("Ölverbrauch");
        FuzzyPart temp_kalt, temp_normal, temp_warm;
        temp_kalt = new FuzzyPart();
        temp_normal = new FuzzyPart();
        temp_warm = new FuzzyPart();
        temp_kalt.setName("kalt");
        temp_normal.setName("normal");
        temp_warm.setName("warm");
        List<float[]> points_temp_kalt = new ArrayList<float[]>();
        List<float[]> points_temp_normal = new ArrayList<float[]>();
        List<float[]> points_temp_warm = new ArrayList<float[]>();
        points_temp_kalt.add(new float[]{-10.0f,1.0f});
        points_temp_kalt.add(new float[]{10.0f,0.0f});
        points_temp_normal.add(new float[]{-10.0f,0.0f});
        points_temp_normal.add(new float[]{10.0f,1.0f});
        points_temp_normal.add(new float[]{30.0f,0.0f});
        points_temp_warm.add(new float[]{10.0f, 0.0f});
        points_temp_warm.add(new float[]{30.0f, 1.0f});
        temp_kalt.setPoints(points_temp_kalt);
        temp_normal.setPoints(points_temp_normal);
        temp_warm.setPoints(points_temp_warm);
        List<FuzzyPart> temp_parts = new ArrayList<FuzzyPart>();
        temp_parts.add(temp_kalt);
        temp_parts.add(temp_normal);
        temp_parts.add(temp_warm);
        temperatur.setFuzzyParts(temp_parts);
        
    }

}
