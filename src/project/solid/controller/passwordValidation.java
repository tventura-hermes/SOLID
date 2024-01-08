package project.solid.controller;

import project.solid.model.authentication;
import project.solid.model.loginPassword;

public class passwordValidation {
    public boolean validatePassword(passwordLogin passwordLogin) {
        authentication validatePassword = new loginPassword();
        boolean passwordAuthentication = validatePassword.credentials(passwordLogin.getUser(), passwordLogin.getPassword());
        return passwordAuthentication;
    }
}
