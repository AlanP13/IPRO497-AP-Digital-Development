/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

/**
 *
 * @author Ghost Protocol
 */
public class adminhome extends javax.swing.JFrame {

    /**
     * Creates new form adminhome
     */
    public adminhome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        admin = new javax.swing.JButton();
        customer = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        rooms = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(210, 280, 190, 160);

        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer);
        customer.setBounds(460, 280, 190, 160);

        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        getContentPane().add(employee);
        employee.setBounds(710, 280, 190, 160);

        rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsActionPerformed(evt);
            }
        });
        getContentPane().add(rooms);
        rooms.setBounds(960, 280, 190, 160);

        head.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        head.setForeground(new java.awt.Color(153, 0, 0));
        head.setText("HAWK STUDY ILLINOIS TECH");
        getContentPane().add(head);
        head.setBounds(380, 20, 630, 50);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 490, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel2.setText("Customer");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 490, 133, 40);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel3.setText("Employee");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(730, 490, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel5.setText("Rooms");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1000, 490, 100, 40);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel6.setText("Admin Home");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(570, 100, 200, 50);

        jButton2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1261, 670, 80, 23);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-100, -120, 3130, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
    admininfo a=new admininfo();
    a.setBounds(0, 0, 1500, 800);
    a.setVisible(true);
    this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed
adminbin a=new adminbin();
        
    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
     customerinfo c=new customerinfo();
     c.setBounds(0, 0, 1500, 800);
     c.setVisible(true);
     this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_customerActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
    employeeinfo e=new employeeinfo();
    e.setBounds(0, 0, 1500, 800);
    e.setVisible(true);
    this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeActionPerformed

    private void roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsActionPerformed
     roominfo r=new roominfo();
     r.setBounds(0, 0, 1500, 800);
     r.setVisible(true);
     this.hide();
        // TODO add your handling code here:
    }//GEN-LAST:event_roomsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            loginpage l=new loginpage();
            l.setBounds(0, 0, 1500, 800);
            l.setVisible(true);
            this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminhome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton customer;
    private javax.swing.JButton employee;
    private javax.swing.JLabel head;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton rooms;
    // End of variables declaration//GEN-END:variables
}
