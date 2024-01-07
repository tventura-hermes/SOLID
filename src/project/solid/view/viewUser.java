package project.solid.view;

import project.solid.controller.user;

public class viewUser implements ingressUser{

    @Override
    public void ingressUser(user user) {
        System.out.println("se ha ingresado al usuario" + user);
    }

}
