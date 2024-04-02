/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Asus
 */
public class UserPojo {
    private String LoginId;
    private String Password;
    private String UserType;
    private String UserName;       

    public UserPojo(String LoginId, String Password, String UserType, String UserName) {
        this.LoginId = LoginId;
        this.Password = Password;
        this.UserType = UserType;
        this.UserName = UserName;
    }

    public UserPojo() {
    }

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}
