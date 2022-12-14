/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ghost Protocol
 */
public class roompage2 extends javax.swing.JFrame {

    /**
     * Creates new form roompage2
     */
    public roompage2() {
        initComponents();
        pop();
       bob();
       roomtype1.setEnabled(false);
       roomtype2.setEnabled(false);
       amount1.setEnabled(false);
       amount2.setEnabled(false);
       roomno1.setEnabled(false);
       roomno2.setEnabled(false);
    }
 int am;
    int pm;
    public void amt(){
        if(roomtype1.getSelectedItem().equals("Single") && roomtype2.getSelectedItem().equals("Single")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
         if(roomtype1.getSelectedItem().equals("Single") && roomtype2.getSelectedItem().equals("Delux")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
          if(roomtype1.getSelectedItem().equals("Single") && roomtype2.getSelectedItem().equals("Gold")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
           if(roomtype1.getSelectedItem().equals("Single") && roomtype2.getSelectedItem().equals("Platinum")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
            if(roomtype1.getSelectedItem().equals("Delux") && roomtype2.getSelectedItem().equals("Single")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
             if(roomtype1.getSelectedItem().equals("Delux") && roomtype2.getSelectedItem().equals("Delux")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
              if(roomtype1.getSelectedItem().equals("Delux") && roomtype2.getSelectedItem().equals("Gold")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
               if(roomtype1.getSelectedItem().equals("Delux") && roomtype2.getSelectedItem().equals("Platinum")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
                if(roomtype1.getSelectedItem().equals("Gold") && roomtype2.getSelectedItem().equals("Single")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
               if(roomtype1.getSelectedItem().equals("Gold") && roomtype2.getSelectedItem().equals("Delux")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
                if(roomtype1.getSelectedItem().equals("Gold") && roomtype2.getSelectedItem().equals("Gold")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
                     if(roomtype1.getSelectedItem().equals("Gold") && roomtype2.getSelectedItem().equals("Platinum")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
              if(roomtype1.getSelectedItem().equals("Platinum") && roomtype2.getSelectedItem().equals("Single")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
              if(roomtype1.getSelectedItem().equals("Platinum") && roomtype2.getSelectedItem().equals("Delux")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
              if(roomtype1.getSelectedItem().equals("Platinum") && roomtype2.getSelectedItem().equals("Gold")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
              if(roomtype1.getSelectedItem().equals("Platinum") && roomtype2.getSelectedItem().equals("Platinum")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+"");
        }
                if(roomtype1.getSelectedItem().equals("Single") && roomtype2.getSelectedItem().equals("No")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+""); 
        }
                if(roomtype1.getSelectedItem().equals("Delux") && roomtype2.getSelectedItem().equals("No")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+""); 
        }
          if(roomtype1.getSelectedItem().equals("Gold") && roomtype2.getSelectedItem().equals("No")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+""); 
        }      
           if(roomtype1.getSelectedItem().equals("Platinum") && roomtype2.getSelectedItem().equals("No")){
           int a=Integer.parseInt(amount1.getText());
           int b=Integer.parseInt(amount2.getText());
           am=a+b;
            total.setText(am+""); 
        }     
    }
 public void pop(){
          try{
                int id=0;
            List<roombin> r=database.getAllRoominsert();
        
            for(roombin b:r){
           
            if(roomtype1.getSelectedItem().equals(b.getRoomtype())){
                
            id=(b.getRoomprice());
          }
            
      }
            List<roombin>rr=database.getAllRoominsertByID(id);
                roomno1.removeAllItems();
                for(roombin rb:rr){
                roomno1.addItem(rb.getRoomno());
                amount1.setText(rb.getRoomprice()+"");
            }
            }    
          catch(Exception e){
            }
      }
      public void bob(){
          try{
                int id=0;
           List<roombin> r=database.getAllRoominsert();
        
            for(roombin b:r){
           
            if(roomtype2.getSelectedItem().equals(b.getRoomtype())){
            id=(b.getRoomprice());
          }
            
      }
            List<roombin>rr=database.getAllRoominsertByID(id);
                roomno2.removeAllItems();
                for(roombin rb:rr){
                roomno2.addItem(rb.getRoomno());
                amount2.setText(rb.getRoomprice()+"");
            }
            }    
          catch(Exception e){
            }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkin = new javax.swing.JTextField();
        amount1 = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        roomtype2 = new javax.swing.JComboBox();
        totalroom = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roomno2 = new javax.swing.JComboBox();
        roomno1 = new javax.swing.JComboBox();
        roomtype1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        customername = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        amount2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Room No:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 440, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel2.setText("Room Type:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 390, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setText("Total Room:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 340, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel4.setText("Check In:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 290, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setText("Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 490, 90, 30);
        getContentPane().add(checkin);
        checkin.setBounds(620, 290, 160, 30);

        amount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount1ActionPerformed(evt);
            }
        });
        getContentPane().add(amount1);
        amount1.setBounds(620, 490, 100, 30);

        save.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        save.setText("Go & Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(533, 620, 130, 27);

        back.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(690, 620, 90, 27);

        roomtype2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roomtype2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "No", "Single", "Delux", "Gold", "Platinum" }));
        roomtype2.setToolTipText("");
        roomtype2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomtype2ItemStateChanged(evt);
            }
        });
        roomtype2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomtype2FocusLost(evt);
            }
        });
        getContentPane().add(roomtype2);
        roomtype2.setBounds(730, 390, 100, 30);

        totalroom.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        totalroom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "1", "2" }));
        totalroom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                totalroomItemStateChanged(evt);
            }
        });
        totalroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                totalroomMouseReleased(evt);
            }
        });
        getContentPane().add(totalroom);
        totalroom.setBounds(620, 340, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("HAWK STUDY ILLINOIS TECH");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 20, 630, 50);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel7.setText("Book Room");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 110, 163, 40);

        roomno2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roomno2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        roomno2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomno2ItemStateChanged(evt);
            }
        });
        roomno2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomno2FocusLost(evt);
            }
        });
        getContentPane().add(roomno2);
        roomno2.setBounds(730, 440, 100, 30);

        roomno1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roomno1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        roomno1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomno1ItemStateChanged(evt);
            }
        });
        roomno1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                roomno1FocusLost(evt);
            }
        });
        getContentPane().add(roomno1);
        roomno1.setBounds(620, 440, 100, 30);

        roomtype1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        roomtype1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Single", "Delux", "Gold", "Platinum" }));
        roomtype1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomtype1ItemStateChanged(evt);
            }
        });
        getContentPane().add(roomtype1);
        roomtype1.setBounds(620, 390, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel8.setText("Customer ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 190, 84, 30);

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel9.setText("Customer Name:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 240, 107, 30);

        customerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeridActionPerformed(evt);
            }
        });
        customerid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customeridKeyReleased(evt);
            }
        });
        getContentPane().add(customerid);
        customerid.setBounds(620, 190, 210, 30);

        customername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customernameKeyReleased(evt);
            }
        });
        getContentPane().add(customername);
        customername.setBounds(620, 240, 210, 30);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(790, 290, 40, 30);

        total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                totalFocusLost(evt);
            }
        });
        total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totalMouseClicked(evt);
            }
        });
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                totalKeyReleased(evt);
            }
        });
        getContentPane().add(total);
        total.setBounds(620, 540, 210, 30);

        amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount2ActionPerformed(evt);
            }
        });
        getContentPane().add(amount2);
        amount2.setBounds(730, 490, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel10.setText("Total Amount:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(470, 539, 110, 30);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-100, -120, 3130, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount1ActionPerformed

    }//GEN-LAST:event_amount1ActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked

    }//GEN-LAST:event_saveMouseClicked
    roombin r=new roombin();
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        r.setCustomerid(Integer.parseInt(customerid.getText()));
        r.setCustomername(customername.getText());
        r.setCheckin(checkin.getText());
        r.setTotalroom(Integer.parseInt(totalroom.getSelectedItem().toString()));
        r.setRoomtype1(roomtype1.getSelectedItem().toString());
        r.setRoomtype2(roomtype2.getSelectedItem().toString());

        if(roomtype2.getSelectedItem().toString()=="No"){
            roomno2.addItem(0);
        }

        r.setRoomno1(Integer.parseInt(roomno1.getSelectedItem().toString()));
        r.setRoomno2(Integer.parseInt(roomno2.getSelectedItem().toString()));
        r.setAmount(Integer.parseInt(total.getText()));

        database.createroomdetail(r);

        database.updateroomAvailable(r);

        paymentpage2 p=new paymentpage2();
        p.setBounds(0, 0, 1500, 800);
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        customerpage2 c=new customerpage2();
        c.setBounds(0, 0, 1500, 800);
        c.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backActionPerformed

    private void roomtype2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomtype2ItemStateChanged
        bob();
    }//GEN-LAST:event_roomtype2ItemStateChanged

    private void roomtype2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomtype2FocusLost
        if(roomtype2.getSelectedItem()=="No"){
            amount2.setText("0");
        }
    }//GEN-LAST:event_roomtype2FocusLost

    private void totalroomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_totalroomItemStateChanged
        if(totalroom.getSelectedItem().equals("1")){
            roomtype1.setEnabled(true);
            roomno1.setEnabled(true);
            amount1.setEnabled(true);
            roomtype2.setEnabled(true);
            amount2.setEnabled(true);
            roomno2.setEnabled(true);

        }
        else  if(totalroom.getSelectedItem().equals("2")){
            roomtype1.setEnabled(true);
            roomno1.setEnabled(true);
            amount1.setEnabled(true);
            roomtype2.setEnabled(true);
            roomno2.setEnabled(true);
            amount2.setEnabled(true);
        }
        else  if(totalroom.getSelectedItem().equals("Select")){

            roomtype1.setEnabled(false);
            roomtype2.setEnabled(false);
            amount1.setEnabled(false);
            amount2.setEnabled(false);
            roomno1.setEnabled(false);
            roomno2.setEnabled(false);
        }
    }//GEN-LAST:event_totalroomItemStateChanged

    private void totalroomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalroomMouseReleased

    }//GEN-LAST:event_totalroomMouseReleased

    private void roomno2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomno2ItemStateChanged

    }//GEN-LAST:event_roomno2ItemStateChanged

    private void roomno2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomno2FocusLost
        room();
    }//GEN-LAST:event_roomno2FocusLost

    private void roomno1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomno1ItemStateChanged

    }//GEN-LAST:event_roomno1ItemStateChanged

    private void roomno1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomno1FocusLost
        room();
    }//GEN-LAST:event_roomno1FocusLost

    private void roomtype1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomtype1ItemStateChanged
        pop();
    }//GEN-LAST:event_roomtype1ItemStateChanged

    private void customeridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeridActionPerformed

    }//GEN-LAST:event_customeridActionPerformed
    customerbin cc =new customerbin();
    private void customeridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customeridKeyReleased
        cc.setCustomerid(Integer.parseInt(customerid.getText()));
        List<customerbin> c=database.getAllcustomerById(cc);
        for(customerbin cb:c){
            customername.setText(cb.getName());
        }
    }//GEN-LAST:event_customeridKeyReleased

    private void customernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customernameKeyReleased

    }//GEN-LAST:event_customernameKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFrame f=new JFrame();
        checkin.setText(new DatePicker(f).setPickedDate());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void totalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalFocusGained
        amt();
    }//GEN-LAST:event_totalFocusGained

    private void totalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalFocusLost

    }//GEN-LAST:event_totalFocusLost

    private void totalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalMouseClicked

    }//GEN-LAST:event_totalMouseClicked

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    private void totalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyPressed

    }//GEN-LAST:event_totalKeyPressed

    private void totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyReleased

    }//GEN-LAST:event_totalKeyReleased

    private void amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount2ActionPerformed

    }//GEN-LAST:event_amount2ActionPerformed

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
            java.util.logging.Logger.getLogger(roompage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roompage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roompage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roompage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roompage2().setVisible(true);
            }
        });
    }
    public void room(){
        
        int p=Integer.parseInt(roomno1.getSelectedItem().toString());
        System.out.println(p);
        if(roomno1.getSelectedItem().equals(p)){
            
            JOptionPane.showMessageDialog(this, "Room No. Are Same");
        }
        else if(roomno2.getSelectedItem().equals(p)){
            
            JOptionPane.showMessageDialog(this, "Room No. Are Same");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount1;
    private javax.swing.JTextField amount2;
    private javax.swing.JButton back;
    private javax.swing.JTextField checkin;
    private javax.swing.JTextField customerid;
    private javax.swing.JTextField customername;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox roomno1;
    private javax.swing.JComboBox roomno2;
    private javax.swing.JComboBox roomtype1;
    private javax.swing.JComboBox roomtype2;
    private javax.swing.JButton save;
    private javax.swing.JTextField total;
    private javax.swing.JComboBox totalroom;
    // End of variables declaration//GEN-END:variables
}
