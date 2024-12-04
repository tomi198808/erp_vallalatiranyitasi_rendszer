package hu.nye.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Represents a user entity in the application.
 * This entity stores information about the user, including username, email,
 * name, and the roles associated with the user.
 */
@Entity
@Table(name = "`user`")
public class User extends AbstractUser {

    /**
     * Default constructor for the User class.
     * Initializes a new instance of the User class.
     */
    public User() {}

    /**
     * Constructs a User with the specified name, email, and primary role.
     *
     * @param name  the name of the user.
     * @param email the email address of the user.
     * @param role  the primary role associated with the user.
     */
    public User(String name, String email, Role role) {
        super(name, email, role);
        this.firstName = name;  // feltételezzük, hogy `name` az első név.
    }

    /**
     * Retrieves user information in a formatted string.
     *
     * @return a string representation of the user's information,
     *         including username, email, and role.
     */
    @Override
    public String getUserInfo() {
        return String.format("User: %s, Email: %s, Role: %s", username, email, role.getRoleName());
    }

    /**
     * Authenticates the user by checking the provided email and password.
     *
     * @param email    the email address used for authentication.
     * @param password the password used for authentication.
     * @return true if the email and password match the user's credentials,
     *         false otherwise.
     */
    @Override
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    /**
     * Logs the user out of the application.
     * This method can include additional logic for handling logout processes.
     */
    @Override
    public void logout() {
        System.out.println("User logged out.");
    }
}
