package com.cathyxz.stockviewer.auth;

import com.cathyxz.stockviewer.models.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;

import java.util.Collections;
import java.util.Optional;

/**
 * Created by czhu on 6/15/17.
 */
public class StockviewerAuthenticator implements Authenticator<String, User> {
    @Override
    public Optional<User> authenticate(String token) throws AuthenticationException {

        // TODO: validate the token, give actual roles
        if (token != null) {
            return Optional.of(new User(token, Collections.EMPTY_LIST));
        }
        return Optional.empty();
    }

}
