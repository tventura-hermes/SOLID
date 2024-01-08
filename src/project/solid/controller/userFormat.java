package project.solid.controller;

public class userFormat {
    public String stringFormat(userInterface userInterface) {
        return "[id=" + userInterface.getId() + ", user=" + userInterface.getUser() + ", password=" + userInterface.getPassword() + "]";
    }
}
