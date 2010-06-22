/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FuzzySolverMainFrame.java
 *
 * Created on 22.06.2010, 15:07:17
 */
package fuzzysolver;

import java.awt.FileDialog;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author malygos
 */
public class FuzzySolverMainFrame extends javax.swing.JFrame {

    private FuzzyTask task;

    /** Creates new form FuzzySolverMainFrame */
    public FuzzySolverMainFrame() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfFuzzyTask = new javax.swing.JTextField();
        btnFuzzyTaskBrowser = new javax.swing.JButton();
        btnSolveFuzzyTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FuzzyTask");

        btnFuzzyTaskBrowser.setText("[...]");
        btnFuzzyTaskBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuzzyTaskBrowserActionPerformed(evt);
            }
        });

        btnSolveFuzzyTask.setText("Solve");
        btnSolveFuzzyTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolveFuzzyTaskActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfFuzzyTask, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFuzzyTaskBrowser))
                    .addComponent(jLabel1)
                    .addComponent(btnSolveFuzzyTask))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFuzzyTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFuzzyTaskBrowser))
                .addGap(18, 18, 18)
                .addComponent(btnSolveFuzzyTask)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuzzyTaskBrowserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuzzyTaskBrowserActionPerformed
        // TODO add your handling code here:
        FileDialog fd = new FileDialog(this, "Load", FileDialog.LOAD);
        fd.show();
        tfFuzzyTask.setText(fd.getDirectory() + fd.getFile());
        loadTask(tfFuzzyTask.getText());
    }//GEN-LAST:event_btnFuzzyTaskBrowserActionPerformed

    private void btnSolveFuzzyTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolveFuzzyTaskActionPerformed
        jTextArea1.setText(task.getJobData());
    }//GEN-LAST:event_btnSolveFuzzyTaskActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FuzzySolverMainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFuzzyTaskBrowser;
    private javax.swing.JButton btnSolveFuzzyTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField tfFuzzyTask;
    // End of variables declaration//GEN-END:variables

    private void loadTask(String text) {
        try {
            task = new FuzzyTask();
            task.loadFromFile(text);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FuzzySolverMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FuzzySolverMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
