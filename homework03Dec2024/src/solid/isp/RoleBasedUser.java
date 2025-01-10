package isp;


import java.util.Collection;

public interface RoleBasedUser extends User{
    
    Collection<Role> roles();
}
