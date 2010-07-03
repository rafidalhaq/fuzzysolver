/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malygos
 */
public abstract class FuzzyTask {

    private String name;
    private List<LinguisticVariable> linguisticVariables;
    private boolean[] jobFlags;
    private String jobData;
    private FuzzyRuleLookupTable rules;

//    public void loadFromFile(String fileName) throws FileNotFoundException, IOException {
////        FileInputStream stream = new FileInputStream(fileName);
////        StringBuilder sb = new StringBuilder();
////        byte[] buffer = new byte[1024];
////        while (stream.read(buffer) >= 0) {
////            char[] data = new char[buffer.length];
////            for (int i = 0; i < buffer.length; i++) {
////                data[i] = (char) buffer[i];
////            }
////            String s = String.valueOf(data);
////            sb.append(s);
////            data = null;
////        }
////        stream.close();
////        buffer = null;
////        // debug only
////        jobData = sb.toString();
////
////        while (sb.length() > 0) {
////            String line = sb.substring(0, sb.indexOf("\n"));
////
////            if (line.startsWith("Task")) {
////                name = line.substring(line.indexOf("=") + 1, line.length());
////            } else if (line.startsWith("variable")) {
////                LinguisticVariable lv = new LinguisticVariable();
////                String content = sb.substring(sb.indexOf("["), sb.indexOf("]"));
////                while (content.length() > 0) {
////                    int length = content.length();
////                    String content_line = content.substring(0, content.indexOf("\n"));
////                    if (content_line.startsWith("name="))
////                        lv.setName(content_line.substring(content_line.indexOf("=")));
////
////                    content = content.substring(content.indexOf("\n"), length);
////
////                }
////                sb.delete(sb.indexOf("["), sb.indexOf("]"));
////            }
////
////            sb.delete(0, sb.indexOf("\n"));
////        }
//    }
//
//    public void saveToFile(String fileName) {
//    }
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
     * @return the linguisticVariables
     */
    public List<LinguisticVariable> getLinguisticVariables() {
        return linguisticVariables;
    }

    /**
     * @param linguisticVariables the linguisticVariables to set
     */
    public void setLinguisticVariables(List<LinguisticVariable> linguisticVariables) {
        this.linguisticVariables = linguisticVariables;
    }

    /**
     * @return the jobFlags
     */
    public boolean[] getJobFlags() {
        return jobFlags;
    }

    /**
     * @param jobFlags the jobFlags to set
     */
    public void setJobFlags(boolean[] jobFlags) {
        this.jobFlags = jobFlags;
    }

    /**
     * @return the jobData
     */
    public String getJobData() {
        return jobData;
    }

    /**
     * @return the rules
     */
    public FuzzyRuleLookupTable getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(FuzzyRuleLookupTable rules) {
        this.rules = rules;
    }

    public abstract float solve(Graphics g, float[] exactValues);

    public float[] getUoD(LinguisticVariable var) {
        if (!getLinguisticVariables().contains(var)) {
            return null;
        }
        float[] uod = new float[2];
        float min = var.getFuzzyParts().get(0).getMinimum();
        float max = var.getFuzzyParts().get(0).getMinimum();

        for (int i = 0; i < var.getFuzzyParts().size(); i++) {
            if (var.getFuzzyParts().get(i).getMinimum() < min) {
                min = var.getFuzzyParts().get(i).getMinimum();
            }
            if (var.getFuzzyParts().get(i).getMaximum() > max) {
                max = var.getFuzzyParts().get(i).getMaximum();
            }
        }

        uod[0] = min;
        uod[1] = max;

        return uod;

    }

    public void drawGraphic(LinguisticVariable var, Graphics g) {
        if (!getLinguisticVariables().contains(var)) {
            return;
        }

        g.create(0, 0, 350, 350);

        float[] uod = getUoD(var);
        float max_x = Math.max(uod[0], uod[1]);

        int scale_x = (int) (325 / max_x);
        int scale_y = 325;

        g.setColor(Color.white);
        g.fillRect(0, 0, 350, 350);

        g.setColor(Color.black);

        g.drawLine(25, 0, 25, 325);
        g.drawLine(25, 325, 350, 325);

        for (int i = 0; i <= 10; i++) {

            int x1_v = 20;
            int x2_v = 30;
            int yv = 325 - i * (325 / 10);
            g.drawLine(x1_v, yv, x2_v, yv);

        }

        for (int i = 0; i <= (int) max_x; i += 2) {
            int x_h = 25 + i * scale_x;
            int y1_h = 320;
            int y2_h = 330;
            g.drawLine(x_h, y1_h, x_h, y2_h);
        }


        for (int i = 0; i < var.getFuzzyParts().size(); i++) {
            FuzzyPart p = var.getFuzzyParts().get(i);
            // Colors have moved to class FuzzyPart
//            float[] hsb = Color.RGBtoHSB(255 - (i * (255 / var.getFuzzyParts().size())), 0, 255, null);
//            g.setColor(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            g.setColor(p.getColor());
            for (int j = 0; j < p.getPoints().length - 1; j++) {
                float[] point_start = p.getPoints()[j];
                float[] point_end = p.getPoints()[j+1];

                int x_start = (int) (25 + point_start[0] * scale_x);
                int x_end = (int) (25 + point_end[0] * scale_x);
                int y_start = (int) (325 - point_start[1] * scale_y);
                int y_end = (int) (325 - point_end[1] * scale_y);
                g.drawLine(x_start, y_start, x_end, y_end);

                g.setColor(Color.black);
                g.drawString("" + (int) point_start[0], x_start - 10, 350);
                g.drawString("" + (int) point_end[0], x_end - 10, 350);

                g.setColor(p.getColor());
            }
        }
    }

    public void drawFuzzyFunction(FuzzyPart function, float[] uod, Graphics g, Color color,
            int height, int width, int left_offset, int bottom_offset,
            int left_space, int bottom_space) {
        g.create(left_offset, bottom_offset, width, height);

        //float[] _uod = uod;
        float max_x = Math.max(uod[0], uod[1]);

        int scale_x = (int) ((width - left_space) / max_x);
        int scale_y = height - bottom_space;

        g.setColor(Color.white);
        g.fillRect(left_offset, bottom_offset, width, height);

        g.setColor(Color.black);

//        g.drawLine(25, 0, 25, 325);
//        g.drawLine(25, 325, 350, 325);
        g.drawLine(left_space, 0, left_space, height - bottom_space);
        g.drawLine(left_space, height - bottom_space, width, height - bottom_space);

        for (int i = 0; i <= 10; i++) {

            int x1_v = left_space - 5;//20;
            int x2_v = left_space + 5;//30;
            int yv = height - bottom_space - i * ((height - bottom_space) / 10);//325 - i * (325 / 10);
            g.drawLine(x1_v, yv, x2_v, yv);

        }

        for (int i = 0; i <= (int) max_x; i += 2) {
            int x_h = left_space + i * scale_x;// 25 + i * scale_x;
            int y1_h = height - bottom_space - 5;//320;
            int y2_h = height - bottom_space + 5;//330;
            g.drawLine(x_h, y1_h, x_h, y2_h);
        }

        g.setColor(color);
        FuzzyPart p = function;
        for (int j = 0; j < p.getPoints().length - 1; j++) {
            float[] point_start = p.getPoints()[j];
            float[] point_end = p.getPoints()[j+1];

            int x_start = (int) (left_space + point_start[0] * scale_x);
            int x_end = (int) (left_space + point_end[0] * scale_x);
            int y_start = (int) (height - bottom_space - point_start[1] * scale_y);
            int y_end = (int) (height - bottom_space - point_end[1] * scale_y);
            g.drawLine(x_start, y_start, x_end, y_end);

            g.setColor(Color.black);
            g.drawString("" + (int) point_start[0], x_start - 10, 350);
            g.drawString("" + (int) point_end[0], x_end - 10, 350);

            g.setColor(color);
        }

    }

    public List<FuzzyPart> getFuzzyForExactValue(float exactValue, LinguisticVariable var) {
        if (!linguisticVariables.contains(var)) {
            return null;
        }

        List<FuzzyPart> parts = new ArrayList<FuzzyPart>();

        for (int i = 0; i < var.getFuzzyParts().size(); i++) {
            FuzzyPart p = var.getFuzzyParts().get(i);
            if (p.isInPart(exactValue)) {
                parts.add(p);
            }
        }

        return parts;
    }

    public void drawGraphicWithExactValue(LinguisticVariable var, Graphics g, float exactValue) {
        drawGraphic(var, g);
        g.setColor(Color.green);
        float[] uod = getUoD(var);
        float max_x = Math.max(uod[0], uod[1]);

        int scale_x = (int) (325 / max_x);
        int scale_y = 325;

        int x = (int) (exactValue * scale_x + 25);

        g.drawLine(x, 0, x, 325);
    }

    public void drawCompleteGraphic(LinguisticVariable var, Graphics g, float exactValue) {
        drawGraphicWithExactValue(var, g, exactValue);

        g.setColor(Color.green);
        float[] uod = getUoD(var);
        float max_x = Math.max(uod[0], uod[1]);

        int scale_x = (int) (325 / max_x);
        int scale_y = 325;

        List<FuzzyResult> results = CalculateEffectiveDegree(var, exactValue);

        int x = (int) (exactValue * scale_x + 25);

        for (int i = 0; i < results.size(); i++) {
            FuzzyResult fRes = results.get(i);

            int y = (int) (325 - fRes.getEffectiveDegree() * scale_y);

            g.drawLine(x, y, 25, y);

            g.setColor(Color.black);
            g.drawString("" + fRes.getEffectiveDegree(), 15, y);
            g.setColor(Color.green);
        }
    }

    public List<FuzzyResult> CalculateEffectiveDegree(LinguisticVariable var, float exactValue) {
        if (!linguisticVariables.contains(var)) {
            return null;
        }
        List<FuzzyPart> parts = getFuzzyForExactValue(exactValue, var);
        int partCount = parts.size();
        List<FuzzyResult> values = new ArrayList<FuzzyResult>();

        for (int i = 0; i < partCount; i++) {
            FuzzyPart p = parts.get(i);
            if (p.isInPart(exactValue)) {
                FuzzyResult fRes = new FuzzyResult();
                fRes.setExactValue(exactValue);
                fRes.setPart(p);
                if (p.isTrivial(exactValue)) {
                    fRes.setEffectiveDegree(p.getTrivialResult(exactValue));
                } else {
                    float value = 0f;
//                    if (exactValue >= p.getMinimum() && exactValue < p.getHighestPoint()) {
//                        value = (exactValue - p.getMinimum()) / (p.getHighestPoint() - p.getMinimum());
//                    } else if (exactValue > p.getHighestPoint() && exactValue <= p.getMaximum()) {
//                        value = 1 - ((exactValue - p.getHighestPoint()) / (p.getMaximum() - p.getHighestPoint()));
//                    }
                    value = p.getY(exactValue);
                    fRes.setEffectiveDegree(value);
                }
                values.add(fRes);
            }

        }

        return values;
    }

    public LinguisticVariable getLinguisticVariableExcludedFrom(LinguisticVariable[] vars) {
        for (int i = 0; i < linguisticVariables.size(); i++) {
            LinguisticVariable var = linguisticVariables.get(i);
            boolean nomatch = true;
            for (int j = 0; j < vars.length; j++) {
                nomatch &= !var.equals(vars[j]);
            }
            if (nomatch == true) {
                return var;
            }

        }
        return null;
    }
}
