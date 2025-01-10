package isp;

public class AuthenticationUserVar1 implements User {

    private final String username;
    private final String password;

    public AuthenticationUserVar1(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public String username() {
        return username;
    }

    @Override
    public String password() {
        return password;
    }
}
