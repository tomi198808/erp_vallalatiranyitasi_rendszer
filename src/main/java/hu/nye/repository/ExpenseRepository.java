package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Expense;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Expense} entity.
 * Provides CRUD operations and additional query methods for managing expenses.
 */
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
