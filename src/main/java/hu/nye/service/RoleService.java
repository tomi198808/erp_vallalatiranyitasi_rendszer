package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import hu.nye.repository.RoleRepository;
import hu.nye.model.Role;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for managing roles in the application.
 * This class provides methods for role operations, including retrieval, creation, and deletion.
 */
@Service
public class RoleService {
    private final RoleRepository roleRepository;

    /**
     * Constructor for RoleService.
     *
     * @param roleRepository The repository used to handle role data.
     */
    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * Retrieves all roles from the repository.
     *
     * @return A list of all roles.
     */
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    /**
     * Retrieves a role by its ID.
     *
     * @param id The ID of the role to retrieve.
     * @return The role with the specified ID, or null if not found.
     */
    public Role getRoleById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    /**
     * Adds a new role to the repository.
     *
     * @param role The role to be added.
     * @return The saved role.
     */
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    /**
     * Deletes a role from the repository by its ID.
     *
     * @param id The ID of the role to delete.
     */
    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
