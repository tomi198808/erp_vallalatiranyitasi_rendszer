package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Role;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Role} entity.
 * Provides CRUD operations and additional query methods for managing roles.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
