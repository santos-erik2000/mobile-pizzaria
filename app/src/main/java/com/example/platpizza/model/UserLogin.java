package com.example.platpizza.model;

public class UserLogin {
    private String userCpfLogin;
    private String userSenhaLogin;

    public UserLogin(String userCpfLogin, String userSenhaLogin) {
        this.userCpfLogin = userCpfLogin;
        this.userSenhaLogin = userSenhaLogin;
    }

    public String getUserCpfLogin() {
        return userCpfLogin;
    }

    public void setUserCpfLogin(String userCpfLogin) {
        this.userCpfLogin = userCpfLogin;
    }

    public String getUserSenhaLogin() {
        return userSenhaLogin;
    }

    public void setUserSenhaLogin(String userSenhaLogin) {
        this.userSenhaLogin = userSenhaLogin;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "userCpfLogin='" + userCpfLogin + '\'' +
                ", userSenhaLogin='" + userSenhaLogin + '\'' +
                '}';
    }
}
