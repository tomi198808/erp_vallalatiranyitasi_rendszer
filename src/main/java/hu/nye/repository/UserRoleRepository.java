package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Role;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Role} entity related to users.
 * Provides CRUD operations and additional query methods for managing user roles.
 */
@Repository
public interface UserRoleRepository extends JpaRepository<Role, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
