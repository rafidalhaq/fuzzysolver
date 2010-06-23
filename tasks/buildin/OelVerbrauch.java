/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tasks.buildin;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import tasks.FuzzyPart;
import tasks.FuzzyRuleLookupTable;
import tasks.FuzzyTask;
import tasks.LinguisticVariable;

/**
 *
 * @author malygos
 */
public class OelVerbrauch extends FuzzyTask{

    private List<FuzzyPart> prepareLV_Temperature(){
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

        return temp_parts;
    }

    private List<FuzzyPart> prepareLV_Oelpreis(){
        FuzzyPart preis_niedrig, preis_mittel, preis_hoch;
        preis_niedrig = new FuzzyPart();
        preis_mittel = new FuzzyPart();
        preis_hoch = new FuzzyPart();
        preis_niedrig.setName("niedrig");
        preis_mittel.setName("mittel");
        preis_hoch.setName("hoch");
        List<float[]> points_preis_niedrig = new ArrayList<float[]>();
        List<float[]> points_preis_mittel = new ArrayList<float[]>();
        List<float[]> points_preis_hoch = new ArrayList<float[]>();
        points_preis_niedrig.add(new float[]{0.0f,1.0f});
        points_preis_niedrig.add(new float[]{12.0f,0.0f});
        points_preis_mittel.add(new float[]{4.0f,0.0f});
        points_preis_mittel.add(new float[]{16.0f,1.0f});
        points_preis_mittel.add(new float[]{28.0f,0.0f});
        points_preis_hoch.add(new float[]{20.0f, 0.0f});
        points_preis_hoch.add(new float[]{32.0f, 1.0f});
        preis_niedrig.setPoints(points_preis_niedrig);
        preis_mittel.setPoints(points_preis_mittel);
        preis_hoch.setPoints(points_preis_hoch);
        List<FuzzyPart> temp_parts = new ArrayList<FuzzyPart>();
        temp_parts.add(preis_niedrig);
        temp_parts.add(preis_mittel);
        temp_parts.add(preis_hoch);

        return temp_parts;
    }

    private List<FuzzyPart> prepareLV_Oelverbrauch(){
        FuzzyPart verbrauch_niedrig, verbrauch_mittel, verbrauch_hoch;
        verbrauch_niedrig = new FuzzyPart();
        verbrauch_mittel = new FuzzyPart();
        verbrauch_hoch = new FuzzyPart();
        verbrauch_niedrig.setName("niedrig");
        verbrauch_mittel.setName("mittel");
        verbrauch_hoch.setName("hoch");
        List<float[]> points_verbrauch_niedrig = new ArrayList<float[]>();
        List<float[]> points_verbrauch_mittel = new ArrayList<float[]>();
        List<float[]> points_verbrauch_hoch = new ArrayList<float[]>();
        points_verbrauch_niedrig.add(new float[]{0.0f,0.0f});
        points_verbrauch_niedrig.add(new float[]{25.0f,1.0f});
        points_verbrauch_niedrig.add(new float[]{50.0f,0.0f});
        points_verbrauch_mittel.add(new float[]{25.0f,0.0f});
        points_verbrauch_mittel.add(new float[]{50.0f,1.0f});
        points_verbrauch_mittel.add(new float[]{75.0f,0.0f});
        points_verbrauch_hoch.add(new float[]{50.0f, 0.0f});
        points_verbrauch_hoch.add(new float[]{75.0f, 1.0f});
        verbrauch_niedrig.setPoints(points_verbrauch_niedrig);
        verbrauch_mittel.setPoints(points_verbrauch_mittel);
        verbrauch_hoch.setPoints(points_verbrauch_hoch);
        List<FuzzyPart> temp_parts = new ArrayList<FuzzyPart>();
        temp_parts.add(verbrauch_niedrig);
        temp_parts.add(verbrauch_mittel);
        temp_parts.add(verbrauch_hoch);

        return temp_parts;
    }



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
        
        temperatur.setFuzzyParts(prepareLV_Temperature());
        oelpreis.setFuzzyParts(prepareLV_Oelpreis());
        oelverbrauch.setFuzzyParts(prepareLV_Oelverbrauch());

        List<LinguisticVariable> lvs = new ArrayList<LinguisticVariable>();
        lvs.add(oelpreis);
        lvs.add(temperatur);
        lvs.add(oelverbrauch);

        setLinguisticVariables(lvs);

        FuzzyRuleLookupTable rules = new FuzzyRuleLookupTable();
        rules.setLeft(oelpreis);
        rules.setTop(temperatur);
        List<String[]> table = new ArrayList<String[]>();
        table.add(new String[]{"niedrig","kalt","hoch"});
        table.add(new String[]{"niedrig","normal","hoch"});
        table.add(new String[]{"niedrig","warm","mittel"});
        table.add(new String[]{"mittel","kalt","hoch"});
        table.add(new String[]{"mittel","normal","mittel"});
        table.add(new String[]{"mittel","warm","niedrig"});
        table.add(new String[]{"hoch","kalt","mittel"});
        table.add(new String[]{"hoch","normal","niedrig"});
        table.add(new String[]{"hoch","warm","niedrig"});

        rules.setAndConnection(true);

        setRules(rules);


    }

}
