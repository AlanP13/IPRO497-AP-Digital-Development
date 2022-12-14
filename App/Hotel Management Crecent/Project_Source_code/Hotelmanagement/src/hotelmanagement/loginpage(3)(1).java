/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Ghost Protocol
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("WELCOME TO HAWK STUDY (IIT)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 900, 50);

        Login.setBackground(new java.awt.Color(153, 153, 255));
        Login.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(153, 0, 0));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(260, 410, 90, 27);
        getContentPane().add(id);
        id.setBounds(260, 270, 250, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Login ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 270, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 330, 90, 30);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw);
        pw.setBounds(260, 330, 250, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-100, -120, 3130, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        String e=id.getText();
        String p=pw.getText();
        
     List<adminbin> a=database.getAlladmin();
       
        for(adminbin ab:a){
           
            if(e.equals(ab.emailid)){
                if(p.equals(ab.password)){
                        JOptionPane.showMessageDialog(this, "Sucessfully Login", "Login", JOptionPane.INFORMATION_MESSAGE);
                    adminhome ah= new adminhome();
                    ah.setBounds(0, 0, 1500, 800);
                    ah.setVisible(true);
                    ah.show();
                    this.dispose();
                }
            }
        }
          List<employeebin> g=database.getAllemployee();
                try{
        String i=id.getText();
        String z=pw.getText();
        for(employeebin em:g){
           
            if(i.equals(em.email)){
                if(z.equals(em.password)){
                        JOptionPane.showMessageDialog(this, "Sucessfully Login", "Login", JOptionPane.INFORMATION_MESSAGE);
                     employeehome eh= new employeehome();
                    eh.setBounds(0, 0, 1500, 800);
                    eh.setVisible(true);
                    eh.show();
                    this.dispose();
                }
            }
                }
                }catch(Exception ex){
                    ex.printStackTrace();
                }
         
    }//GEN-LAST:event_LoginActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed

    }//GEN-LAST:event_pwActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new loginpage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pw;
    // End of variables declaration//GEN-END:variables
}
