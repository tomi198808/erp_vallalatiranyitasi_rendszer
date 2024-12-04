package hu.nye.service;

import hu.nye.model.User;
import hu.nye.model.Role;
import hu.nye.model.Permission;
import java.util.List;

/**
 * Interface for managing user roles and permissions.
 * This interface defines methods for assigning and removing roles from users,
 * as well as retrieving permissions associated with specific roles.
 */
public interface UserRoleServiceInterface {

    /**
     * Assigns a role to a user.
     *
     * @param user The user to whom the role will be assigned.
     * @param role The role to be assigned to the user.
     */
    void assignRoleToUser(User user, Role role);

    /**
     * Removes a role from a user.
     *
     * @param user The user from whom the role will be removed.
     * @param role The role to be removed from the user.
     */
    void removeRoleFromUser(User user, Role role);

    /**
     * Retrieves the permissions associated with a given role.
     *
     * @param role The role for which permissions are to be fetched.
     * @return A list of permissions associated with the specified role.
     */
    List<Permission> getPermissionsForRole(Role role);
}
