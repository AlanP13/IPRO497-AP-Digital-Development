/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import javax.swing.JProgressBar;

/**
 *
 * @author Ghost Protocol
 */
public class Splash extends javax.swing.JPanel {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
    }
        public  void abc(int a){
            Progress.setValue(a);
        
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Progress = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("0%");
        add(jLabel1);
        jLabel1.setBounds(410, 580, 50, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("100%");
        add(jLabel3);
        jLabel3.setBounds(960, 580, 73, 40);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("WELCOME TO HAWK STUDY (IIT)");
        add(jLabel5);
        jLabel5.setBounds(250, 20, 900, 50);
        add(Progress);
        Progress.setBounds(480, 580, 460, 40);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Starting...");
        add(jLabel4);
        jLabel4.setBounds(640, 630, 150, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Caribbean Shores.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(-120, -150, 1710, 1000);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Progress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
