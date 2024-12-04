package hu.nye.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a role entity in the application.
 * This entity stores information about a role, including its name and associated users.
 */
@Entity
public class Role {

    /**
     * Unique identifier for the role, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    /**
     * The name of the role.
     */
    private String roleName;

    /**
     * Set of users who have this role.
     * This is a many-to-many relationship mapped by the "roles" field in the {@link User} entity.
     */
    @ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    /**
     * Default constructor for the Role class.
     */
    public Role() {}

    /**
     * Constructs a Role with the specified role name.
     *
     * @param roleName the name of the role.
     */
    public Role(String roleName) {
        this.roleName = roleName;
    }

    // Getters and Setters

    /**
     * Retrieves the name of the role.
     *
     * @return the role name.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the name of the role.
     *
     * @param roleName the new name for the role.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Retrieves the set of users associated with this role.
     *
     * @return the set of users who have this role.
     */
    public Set<User> getUsers() {
        return users;
    }

    /**
     * Sets the set of users associated with this role.
     *
     * @param users the new set of users for the role.
     */
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
