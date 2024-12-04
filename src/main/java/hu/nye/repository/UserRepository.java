package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.User;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link User} entity.
 * Provides CRUD operations and additional query methods for managing users.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
