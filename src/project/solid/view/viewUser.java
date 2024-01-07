package project.solid.view;


public class viewUser implements ingressUser{

    @Override
    public void ingress(String value) {
        System.out.println("se ha ingresado al usuario: " + value);
    }

}
