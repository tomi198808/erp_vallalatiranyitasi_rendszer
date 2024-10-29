public class UserRoleService implements UserRoleServiceInterface {
    private Map<User, Role> userRoles = new HashMap<>();

    @Override
    public void assignRoleToUser(User user, Role role) {
        userRoles.put(user, role);
    }

    @Override
    public void removeRoleFromUser(User user, Role role) {
        userRoles.remove(user);
    }

    @Override
    public List<Permission> getPermissionsForRole(Role role) {
        // Permission fetching logic
        return new ArrayList<>();
    }
}