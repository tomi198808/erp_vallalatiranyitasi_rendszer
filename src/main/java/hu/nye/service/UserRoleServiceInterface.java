public interface UserRoleServiceInterface {
    void assignRoleToUser(User user, Role role);
    void removeRoleFromUser(User user, Role role);
    List<Permission> getPermissionsForRole(Role role);
}