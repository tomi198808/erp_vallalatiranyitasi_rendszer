@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    private String roleName;
	
	@ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    // Esetleg permissions lista is hozzáadható

    // Konstruktorok, getterek, setterek
    public Role() {}

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

     public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
