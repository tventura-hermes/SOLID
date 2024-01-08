package project.solid.controller;

public class user  implements userInterface{
    private Integer id ;
    private String user;
    private String password;
    
    public user() {

    }

    public user(Integer id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public String getPassword() {
        return password;
    }
    
}