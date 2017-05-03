/*
 * This file is generated by jOOQ.
*/
package com.cathyxz.stockviewer.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Users implements Serializable {

    private static final long serialVersionUID = 2103930659;

    private Integer id;
    private String  username;
    private String  email;
    private String  password;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.username = value.username;
        this.email = value.email;
        this.password = value.password;
    }

    public Users(
        Integer id,
        String  username,
        String  email,
        String  password
    ) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(username);
        sb.append(", ").append(email);
        sb.append(", ").append(password);

        sb.append(")");
        return sb.toString();
    }
}
