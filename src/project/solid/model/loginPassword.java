package project.solid.model;

public class loginPassword implements authentication {

    @Override
    public boolean credentials(String user, String key) {
        return true;
    }
    
}
