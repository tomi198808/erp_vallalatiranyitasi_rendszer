package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Customer;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Customer} entity.
 * Provides CRUD operations and additional query methods for managing customers.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
