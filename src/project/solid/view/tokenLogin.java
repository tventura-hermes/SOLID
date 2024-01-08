package project.solid.view;

import project.solid.controller.token;
import project.solid.controller.tokenValidator;

public class tokenLogin {
    public static void main(String[] args) {
        token newToken = new token("", "");
        tokenValidator tokenValidator = new tokenValidator();
        boolean confirm = tokenValidator.validateToken(newToken);
        login login = new viewLogin();
        login.login(message.sendMessage(confirm));
    }
}
