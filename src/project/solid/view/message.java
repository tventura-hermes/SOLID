package project.solid.view;

public class message {
    public static String sendMessage(boolean value) {
        String message;
        if (value) {
            message = "Login exitoso";
        } else {
            message = "Error en el login";
        }
        return message;
    }
}
