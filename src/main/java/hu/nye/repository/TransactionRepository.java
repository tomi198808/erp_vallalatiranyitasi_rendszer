package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Transaction;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Transaction} entity.
 * Provides CRUD operations and additional query methods for managing transactions.
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
