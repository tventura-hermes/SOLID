package project.solid.model;

public class loginToken implements authentication {

    @Override
    public boolean credentials(String user, String key) {
        return true;
    }

}
