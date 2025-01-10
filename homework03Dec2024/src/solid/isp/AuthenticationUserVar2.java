package isp;

import java.util.Collection;
import java.util.List;

public class AuthenticationUserVar2 implements RoleBasedUser {
    private final String username;
    private final String password;

    private final List<Role> roles;

    public AuthenticationUserVar2(String username, String password, List<Role> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }


    @Override
    public Collection<Role> roles() {
        return roles;
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
