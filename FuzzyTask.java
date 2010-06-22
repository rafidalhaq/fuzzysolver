/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzysolver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author malygos
 */
public class FuzzyTask {

    private String name;
    private List<LinguisticVariable> linguisticVariables;
    private boolean[] jobFlags;
    private String jobData;

    public void loadFromFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream stream = new FileInputStream(fileName);
        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[1024];
        while (stream.read(buffer) >= 0) {
            char[] data = new char[buffer.length];
            for (int i = 0; i < buffer.length; i++) {
                data[i] = (char) buffer[i];
            }
            String s = String.valueOf(data);
            sb.append(s);
            data = null;
        }
        stream.close();
        buffer = null;
        // debug only
        jobData = sb.toString();

        while (sb.length() > 0) {
            String line = sb.substring(0, sb.indexOf("\n"));

            if (line.startsWith("Task")) {
                name = line.substring(line.indexOf("=") + 1, line.length());
            } else if (line.startsWith("variable")) {
                LinguisticVariable lv = new LinguisticVariable();
                String content = sb.substring(sb.indexOf("["), sb.indexOf("]"));
                while (content.length() > 0) {
                    int length = content.length();
                    String content_line = content.substring(0, content.indexOf("\n"));
                    if (content_line.startsWith("name="))
                        lv.setName(content_line.substring(content_line.indexOf("=")));

                    content = content.substring(content.indexOf("\n"), length);

                }
                sb.delete(sb.indexOf("["), sb.indexOf("]"));
            }

            sb.delete(0, sb.indexOf("\n"));
        }
    }

    public void saveToFile(String fileName) {
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
}
