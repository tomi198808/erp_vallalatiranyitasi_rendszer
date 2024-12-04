package hu.nye.model;

/**
 * Represents a permission entity in the application.
 * This entity stores the name of a specific permission that can be assigned to users or roles.
 */
public class Permission {

    /**
     * The name of the permission.
     */
    private String permissionName;

    /**
     * Constructs a Permission with the specified permission name.
     *
     * @param permissionName the name of the permission.
     */
    public Permission(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * Retrieves the name of the permission.
     *
     * @return the name of the permission.
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * Sets the name of the permission.
     *
     * @param permissionName the new name for the permission.
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }
}
