package project.solid.view;

import project.solid.controller.superUser;
import project.solid.controller.user;
import project.solid.controller.userInterface;

public class admin {
    public static void main(String[] args) {
        userInterface admin = new user(1, "admin", "123");
        superUser newAdmin = new superUser();
        String adminInfo = newAdmin.stringFormat(admin);
        ingressUser ingressAdmin = new viewUser();
        ingressAdmin.ingress(adminInfo + " " + newAdmin.editor());
    }
}
