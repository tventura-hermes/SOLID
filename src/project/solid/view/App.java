package project.solid.view;
import project.solid.controller.user;
import project.solid.controller.userFormat;

public class App {
    public static void main(String[] args) throws Exception {
        user dataUser = new user(1, "Juan", "admin", "123");
        userFormat format = new userFormat();
        String formattedUser = format.stringFormat(dataUser);
        ingressUser ingressDataUser = new viewUser();
        ingressDataUser.ingress(formattedUser);
    }
}