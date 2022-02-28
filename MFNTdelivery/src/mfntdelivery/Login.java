/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

import com.formdev.flatlaf.*;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.beans.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USER
 */


public class Login extends javax.swing.JFrame {
    
    ProductMenuGUI prodMenu = new ProductMenuGUI();
    
    
    public Login() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        UIManager.put("TextComponent.arc", 15);
        UIManager.put("Button.arc", 15);
        UIManager.put("PasswordField.showRevealButton", true);

        initComponents();

    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginBTN = new javax.swing.JButton();
        labelPw = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 28, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfntdelivery/image/6617321.png"))); // NOI18N

        emailField.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        emailField.setForeground(new java.awt.Color(235, 225, 206));
        emailField.setMargin(new java.awt.Insets(2, 12, 2, 12));

        passwordField.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        passwordField.setMargin(new java.awt.Insets(2, 12, 2, 2));

        loginBTN.setBackground(new java.awt.Color(231, 68, 67));
        loginBTN.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        loginBTN.setForeground(new java.awt.Color(244, 202, 169));
        loginBTN.setText("Sign In");
        loginBTN.setMargin(new java.awt.Insets(2, 14, 5, 14));
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });

        labelPw.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelPw.setForeground(new java.awt.Color(235, 225, 206));
        labelPw.setText(" Password");

        labelEmail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(235, 225, 206));
        labelEmail.setText(" E-mail");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(231, 68, 67));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MFNT Delivery");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel5.setBackground(new java.awt.Color(255, 51, 204));
        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(170, 101, 70));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign to continue");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(255, 51, 204));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 230, 223));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Don't have account ?");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setBackground(new java.awt.Color(255, 51, 204));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 151, 220));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Sign up now");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(70, 25));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPw, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(loginBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPw, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        emailField.putClientProperty("JTextField.showClearButton", true);
        //passwordField.putClientProperty( "JComponent.roundRect", true );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Register regis = new Register();
        regis.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTNMouseClicked
        // TODO add your handling code here:
        String DATABASE_URL = "jdbc:sqlite:DBuserDetails.sqlite";

        try ( ConnectionSource cs = new JdbcConnectionSource(DATABASE_URL);) {
            Dao<UserDetails, String> userDao = DaoManager.createDao(cs, UserDetails.class);
            
                       
            String passConv = String.valueOf(passwordField.getPassword());
            boolean registeredUser = false;
            
            
            List<UserDetails> list = userDao.queryForAll();
            for (UserDetails ud : list) {
                if (emailField.getText().equals(ud.userEmail) && passConv.equals(ud.userPass)) {
                    prodMenu.setUsernameLabel(ud.userName);
                    registeredUser = true;
                }
            }

            if (registeredUser) {

                prodMenu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showConfirmDialog(jPanel1, "Username or password not found.", null, JOptionPane.CLOSED_OPTION, JOptionPane.PLAIN_MESSAGE);
            }

        } catch (java.sql.SQLException sqle) {
            sqle.printStackTrace();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        
    }//GEN-LAST:event_loginBTNMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    UIManager.setLookAndFeel(new FlatDarkLaf());
//
//                    Login log = new Login();
//                    log.setVisible(true);
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelPw;
    private javax.swing.JButton loginBTN;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables

}
