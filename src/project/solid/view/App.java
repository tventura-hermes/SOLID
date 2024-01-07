package project.solid.view;
import project.solid.controller.user;

public class App {
    public static void main(String[] args) throws Exception {
        user dataUser = new user(1, "Juan", "admin", "123");
        ingressUser ingressDataUser = new viewUser();
        ingressDataUser.ingressUser(dataUser);
    }
}