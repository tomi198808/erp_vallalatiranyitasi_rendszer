@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;
    private String email;

    // Kapcsolat a Role osztállyal
    @ManyToOne
    @JoinColumn(name = "roleId")
    private Role role;
	
	// Many-to-Many kapcsolat a Role osztállyal
    @ManyToMany
    @JoinTable(
      name = "UserRole", 
      joinColumns = @JoinColumn(name = "userId"), 
      inverseJoinColumns = @JoinColumn(name = "roleId"))
    private Set<Role> roles = new HashSet<>();

    // Konstruktorok, getterek, setterek

    public User() {}

    public User(String name, String email, Role role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
	
	public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    // Egyéb metódusok, pl. getUserInfo()
}
