/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import project.proses.Login;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Irvan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            SwingUtilities.invokeLater(new Runnable() {
                public void run() { 
                  Login log = new Login();
                  log.setLocationRelativeTo(null);
                     log.setVisible(true);
                 
            
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
