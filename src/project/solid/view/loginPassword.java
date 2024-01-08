package project.solid.view;

import project.solid.controller.passwordLogin;
import project.solid.controller.passwordValidation;

public class loginPassword {
    public static void main(String[] args) {
        passwordLogin passwordLogin = new passwordLogin("", "");
        passwordValidation passwordValidation = new passwordValidation();
        boolean confirm = passwordValidation.validatePassword(passwordLogin);
        login login = new viewLogin();
        login.login(message.sendMessage(confirm));
    }
}
