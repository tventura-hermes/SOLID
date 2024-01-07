package project.solid.controller;

public class userFormat {
    public String stringFormat(user user) {
        return "[id=" + user.getId() + ", name=" + user.getName() + ", user=" + user.getUser() + ", password=" + user.getPassword() + "]";
    }
}
