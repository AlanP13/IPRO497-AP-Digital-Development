/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JWindow;

/**
 *
 * @author Ghost Protocol
 */
public class SplashClass {
    public static void main(String[] args) {
        Dimension sc=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(sc.width-428)/2;
        int y=(sc.height-243)/2;
        JWindow w=new JWindow();
        Splash s=new Splash();
        w.setContentPane(s);
        w.setBounds(0, 0, 1500, 800);
        w.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                s.abc(i);
            }
        } catch (Exception e) {
        }
        w.setVisible(false);
        
        loginpage l=new loginpage();
        l.setBounds(0, 0, 1500, 800);
        l.setVisible(true);
        
    }
}
