package com.eatmans.oauth.domain;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/6
 */
public class AccountCredentials {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
