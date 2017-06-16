package com.cathyxz.stockviewer.auth;

import com.cathyxz.stockviewer.models.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

import java.util.Collections;
import java.util.Optional;

/**
 * Created by czhu on 6/15/17.
 */
public class StockviewerAuthenticator implements Authenticator<BasicCredentials, User> {
    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException {

        if(credentials.getUsername() != null) {
            return Optional.of(new User(credentials.getUsername(), Collections.EMPTY_LIST));
        }
        return Optional.empty();
    }

}
