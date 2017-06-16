package com.cathyxz.stockviewer.auth;

/**
 * Created by czhu on 6/15/17.
 */
public class OAuth2Credentials {

    private String username;
    private String token;
    public OAuth2Credentials(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public String getToken() {
        return token;
    }

}
