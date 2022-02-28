/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

import com.formdev.flatlaf.FlatDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.table.TableUtils;
import java.util.List;

/**
 *
 * @author USER
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    UserDetails user = new UserDetails();
    Login log = new Login(){};
    public Register() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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
        backLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        unameField = new javax.swing.JTextField();
        fieldPW = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldConfirmPW = new javax.swing.JPasswordField();
        signUpBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unameErrLabel = new javax.swing.JLabel();
        errLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(29, 28, 35));

        backLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        backLabel.setForeground(new java.awt.Color(235, 225, 206));
        backLabel.setText("↵ Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        emailField.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        emailField.setMargin(new java.awt.Insets(2, 12, 2, 12));
        emailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailFieldKeyReleased(evt);
            }
        });

        unameField.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        unameField.setMargin(new java.awt.Insets(2, 12, 2, 12));
        unameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unameFieldKeyTyped(evt);
            }
        });

        fieldPW.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        fieldPW.setMargin(new java.awt.Insets(2, 12, 2, 12));
        fieldPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPWKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 68, 67));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create an account");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        fieldConfirmPW.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        fieldConfirmPW.setMargin(new java.awt.Insets(2, 12, 2, 6));
        fieldConfirmPW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldConfirmPWKeyReleased(evt);
            }
        });

        signUpBTN.setBackground(new java.awt.Color(231, 68, 67));
        signUpBTN.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        signUpBTN.setText("Sign Up");
        signUpBTN.setMargin(new java.awt.Insets(2, 14, 5, 14));
        signUpBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBTNMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(235, 225, 206));
        jLabel3.setText(" E-mail");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(235, 225, 206));
        jLabel4.setText(" Confirm Password");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 225, 206));
        jLabel5.setText(" Username");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(235, 225, 206));
        jLabel6.setText(" Password");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mfntdelivery/image/burgerIcon.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        unameErrLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        unameErrLabel.setForeground(new java.awt.Color(255, 51, 51));
        unameErrLabel.setText(" ");

        errLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        errLabel.setForeground(new java.awt.Color(255, 51, 51));
        errLabel.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldPW, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(unameErrLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)))
                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldConfirmPW, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(errLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unameField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unameErrLabel)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(fieldPW, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldConfirmPW, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errLabel)
                .addGap(29, 29, 29)
                .addComponent(signUpBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

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


    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_backLabelMouseClicked

    private void signUpBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpBTNMouseClicked
        // TODO add your handling code here:
        user.setUserName(unameField.getText());
        user.setUserEmail(emailField.getText());
        user.setUserPass(fieldPW.getPassword());
        user.setUserPassConfirm(fieldConfirmPW.getPassword());

        try {
            if (user.getUserName().length() >= 7 && user.getUserEmail().contains("@")
                    && user.getUserPass().length() >= 7 && user.getUserPassConfirm().length() >= 7
                    && (user.getUserPass().equals(user.getUserPassConfirm()))) {

                String DATABASE_URL = "jdbc:sqlite:DBuserDetails.sqlite";

                try ( ConnectionSource connectionSource
                        = new JdbcConnectionSource(DATABASE_URL);) {
                    Dao<UserDetails, String> userDao
                            = DaoManager.createDao(
                                    connectionSource,
                                    UserDetails.class
                            );

                    TableUtils.createTableIfNotExists(
                            connectionSource, UserDetails.class
                    );

                    boolean registeredUser = false;
                    List<UserDetails> list = userDao.queryForAll();
                    for (UserDetails ud : list) {
                        if (emailField.getText().equals(ud.userEmail) || unameField.getText().equals(ud.userName)) {
                            
                            registeredUser = true;
                        }
                    }

                    if (!registeredUser) {
                        UserDetails userDB = new UserDetails("" + user.getUserName(), "" + user.getUserEmail(), "" + user.getUserPass());
                        userDao.create(userDB);
                        JOptionPane.showConfirmDialog(jPanel1, "Thank You for registering", "Register Success", JOptionPane.CLOSED_OPTION);
                        
                        
                        log.setVisible(true);
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(jPanel1, "Username atau email sudah terdaftar", "Error", JOptionPane.ERROR_MESSAGE);

                    }

                } catch (java.sql.SQLException sqle) {
                    sqle.printStackTrace();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(jPanel1, "Field harus terisi semua", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_signUpBTNMouseClicked


    private void fieldConfirmPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldConfirmPWKeyReleased
        // TODO add your handling code here:
        user.setUserPass(fieldPW.getPassword());
        user.setUserPassConfirm(fieldConfirmPW.getPassword());

        if (!user.getUserPass().equals(user.getUserPassConfirm())) {
            errLabel.setText("Password does not match.");
        } else {
            errLabel.setText(" ");
            user.setUserPassConfirm(fieldConfirmPW.getPassword());
        }
    }//GEN-LAST:event_fieldConfirmPWKeyReleased

    private void fieldPWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPWKeyReleased
        // TODO add your handling code here:
        user.setUserPass(fieldPW.getPassword());

        if (user.getUserPass().length() < 8) {
            errLabel.setText("Password must have at least 8 characters.");

        } else if (!user.getUserPass().equals(user.getUserPassConfirm())) {
            errLabel.setText("Please re-type password.");

        } else {
            errLabel.setText(" ");
            user.setUserPass(fieldPW.getPassword());
        }
    }//GEN-LAST:event_fieldPWKeyReleased

    private void unameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameFieldKeyTyped
        // TODO add your handling code here:
        user.setUserName(unameField.getText());

        if (user.getUserName().length() < 7) {
            unameErrLabel.setText("Username must have at least 8 characters.");

        } else {
            unameErrLabel.setText(" ");
            user.setUserName(unameField.getText());
        }
    }//GEN-LAST:event_unameFieldKeyTyped

    private void emailFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailFieldKeyReleased
        // TODO add your handling code here:
        user.setUserEmail(emailField.getText());

        if (!user.getUserEmail().contains("@")) {
            errLabel.setText("Enter valid E-mail format.");
        } else {
            errLabel.setText(" ");
            user.setUserEmail(emailField.getText());
        }
    }//GEN-LAST:event_emailFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel errLabel;
    private javax.swing.JPasswordField fieldConfirmPW;
    private javax.swing.JPasswordField fieldPW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signUpBTN;
    private javax.swing.JLabel unameErrLabel;
    private javax.swing.JTextField unameField;
    // End of variables declaration//GEN-END:variables
}
