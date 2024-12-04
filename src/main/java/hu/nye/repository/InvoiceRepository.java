package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Invoice;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Invoice} entity.
 * Provides CRUD operations and additional query methods for managing invoices.
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
