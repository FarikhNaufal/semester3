/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.formdev.flatlaf.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class MFNTdelivery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new FlatDarkLaf());            
            Login log = new Login();
            log.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MFNTdelivery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
