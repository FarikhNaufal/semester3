/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author USER
 */
@DatabaseTable(tableName = "user_info")
public class UserDetails {

    @DatabaseField(id = true)
    Integer idUser;

    @DatabaseField(canBeNull = false, width = 255)
    String userName;

    @DatabaseField(canBeNull = false, width = 50)
    String userEmail;
    
    @DatabaseField(canBeNull = false, width = 50)
    String userPass;
    
    
    public UserDetails(String userName, String userEmail, String userPass) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPass = String.valueOf(userPass);
    }

    public UserDetails() {
    }

    

    
    private String userPassConfirm;
    private double userSaldo = 50000;

    
    public Integer getUserID(){
        return idUser;
    }
    
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(char[] userPass) {
        this.userPass = String.valueOf(userPass);
    }

    public String getUserPassConfirm() {
        return userPassConfirm;
    }

    public void setUserPassConfirm(char[] userPassConfirm) {
        this.userPassConfirm = String.valueOf(userPassConfirm);
    }
}
