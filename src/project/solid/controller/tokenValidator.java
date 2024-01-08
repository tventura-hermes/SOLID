package project.solid.controller;

import project.solid.model.authentication;
import project.solid.model.loginToken;

public class tokenValidator {
    public boolean validateToken(token token) {
        authentication validateToken = new loginToken();
        boolean tokenAuthentication = validateToken.credentials(token.getUser(), token.getToken());
        return tokenAuthentication;
    }
}
