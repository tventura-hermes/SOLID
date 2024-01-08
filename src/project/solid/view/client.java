package project.solid.view;

import project.solid.controller.commonUser;
import project.solid.controller.user;
import project.solid.controller.userInterface;

public class client {
    public static void main(String[] args) throws Exception {
        userInterface client = new user(2, "client", "123");
        commonUser newClient = new commonUser();
        String clientInfo = newClient.stringFormat(client);
        ingressUser ingressClient = new viewUser();
        ingressClient.ingress(clientInfo);
    }
}