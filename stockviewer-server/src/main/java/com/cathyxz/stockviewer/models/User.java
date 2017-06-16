package com.cathyxz.stockviewer.models;

import java.security.Principal;
import java.util.List;

/**
 * Created by czhu on 6/15/17.
 */
public class User implements Principal {
    private String name;
    private List<String> roles;

    public User(String name, List<String> roles) {
        this.name = name;
        this.roles = roles;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<String> getRoles() {
        return roles;
    }

}
