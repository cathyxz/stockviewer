package com.cathyxz.stockviewer.auth;

import com.cathyxz.stockviewer.models.User;
import io.dropwizard.auth.Authorizer;

/**
 * Created by czhu on 6/15/17.
 */
public class StockviewerAuthorizer implements Authorizer<User> {

    @Override
    public boolean authorize(User user, String role) {
        return user.getRoles() != null && user.getRoles().contains(role);
    }
}
