package hu.nye.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser osztály, amely tartalmazza az alapvető felhasználói attribútumokat és metódusokat.
 * Az osztály a felhasználók közös jellemzőit definiálja, mint például a felhasználónév, jelszó, név,
 * e-mail cím, szerep és telefonszám.
 */
@MappedSuperclass
public abstract class AbstractUser {

    /**
     * User ID, automatikusan generált egyedi azonosító.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer userId;

    /**
     * A felhasználóneve.
     */
    protected String username;

    /**
     * A felhasználó jelszava.
     */
    protected String password;

    /**
     * A felhasználó keresztneve.
     */
    protected String firstName;

    /**
     * A felhasználó vezetékneve.
     */
    protected String lastName;

    /**
     * A felhasználó e-mail címe.
     */
    protected String email;

    /**
     * A felhasználó elsődleges szerepe.
     */
    @ManyToOne
    @JoinColumn(name = "roleId")
    protected Role role;

    /**
     * A felhasználó szerepkörei.
     */
    @ManyToMany
    @JoinTable(
            name = "UserRole",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    protected Set<Role> roles = new HashSet<>();

    /**
     * A felhasználó telefonszáma.
     */
    protected String phoneNumber;

    /**
     * Konstruktor, amely inicializálja az AbstractUser példányt.
     */
    public AbstractUser() {}

    /**
     * Konstruktor, amely inicializálja az AbstractUser példányt a megadott paraméterekkel.
     *
     * @param username a felhasználóneve
     * @param email    a felhasználó e-mail címe
     * @param role     a felhasználó szerepe
     */
    public AbstractUser(String username, String email, Role role) {
        this.username = username;
        this.email = email;
        this.role = role;
    }

    // Getterek és Setterek

    /**
     * Visszaadja a felhasználó azonosítóját.
     *
     * @return a felhasználó azonosítója
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Beállítja a felhasználó azonosítóját.
     *
     * @param userId a felhasználó azonosítója
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * Visszaadja a felhasználó elsődleges szerepét.
     *
     * @return a felhasználó szerepe
     */
    public Role getRole() {
        return role;
    }

    /**
     * Beállítja a felhasználó elsődleges szerepét.
     *
     * @param role a felhasználó szerepe
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Visszaadja a felhasználó szerepköreit.
     *
     * @return a felhasználó szerepkörei
     */
    public Set<Role> getRoles() {
        return roles;
    }

    /**
     * Beállítja a felhasználó szerepköreit.
     *
     * @param roles a felhasználó szerepkörei
     */
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    /**
     * Visszaadja a felhasználó nevét.
     *
     * @return a felhasználó neve
     */
    public String getUsername() {
        return username;
    }

    /**
     * Beállítja a felhasználó nevét.
     *
     * @param username a felhasználó neve
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Visszaadja a felhasználó e-mail címét.
     *
     * @return a felhasználó e-mail címe
     */
    public String getEmail() {
        return email;
    }

    /**
     * Beállítja a felhasználó e-mail címét.
     *
     * @param email a felhasználó e-mail címe
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Visszaadja a felhasználó jelszavát.
     *
     * @return a felhasználó jelszava
     */
    public String getPassword() {
        return password;
    }

    /**
     * Beállítja a felhasználó jelszavát.
     *
     * @param password a felhasználó jelszava
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Visszaadja a felhasználó keresztnevét.
     *
     * @return a felhasználó keresztneve
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Beállítja a felhasználó keresztnevét.
     *
     * @param firstName a felhasználó keresztneve
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Visszaadja a felhasználó vezetéknevét.
     *
     * @return a felhasználó vezetékneve
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Beállítja a felhasználó vezetéknevét.
     *
     * @param lastName a felhasználó vezetékneve
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Visszaadja a felhasználó telefonszámát.
     *
     * @return a felhasználó telefonszáma
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Beállítja a felhasználó telefonszámát.
     *
     * @param phoneNumber a felhasználó telefonszáma
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Absztrakt metódusok

    /**
     * Visszaadja a felhasználó információit.
     *
     * @return a felhasználó információi
     */
    public abstract String getUserInfo();

    /**
     * Bejelentkezik a felhasználó.
     *
     * @param email    a felhasználó e-mail címe
     * @param password a felhasználó jelszava
     * @return true, ha a bejelentkezés sikeres, különben false
     */
    public abstract boolean login(String email, String password);

    /**
     * Kijelentkezik a felhasználó.
     */
    public abstract void logout();
}
