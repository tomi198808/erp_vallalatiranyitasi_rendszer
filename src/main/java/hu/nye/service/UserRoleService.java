package hu.nye.service;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import hu.nye.model.User; // Add this import statement
import hu.nye.model.Role; // Add this import statement
import hu.nye.model.Permission; // Add this import statement

/**
 * Service class for managing user roles and permissions.
 * This class provides methods to assign and remove roles from users,
 * as well as to retrieve permissions associated with a specific role.
 */
public class UserRoleService implements UserRoleServiceInterface {
    private Map<User, Role> userRoles = new HashMap<>();

    /**
     * Assigns a role to a user.
     *
     * @param user The user to whom the role will be assigned.
     * @param role The role to be assigned to the user.
     */
    @Override
    public void assignRoleToUser(User user, Role role) {
        userRoles.put(user, role);
    }

    /**
     * Removes a role from a user.
     * The role parameter is not used, as the role is determined by the user.
     *
     * @param user The user from whom the role will be removed.
     */
    @Override
    public void removeRoleFromUser(User user, Role role) {
        userRoles.remove(user);
    }

    /**
     * Retrieves the permissions associated with a given role.
     *
     * @param role The role for which permissions are to be fetched.
     * @return A list of permissions associated with the specified role.
     */
    @Override
    public List<Permission> getPermissionsForRole(Role role) {
        // Permission fetching logic (to be implemented)
        return new ArrayList<>();
    }
}
