package hu.nye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hu.nye.model.Product;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Product} entity.
 * Provides CRUD operations and additional query methods for managing products.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // A CRUD műveletek automatikusan elérhetőek a JpaRepository által.
    // További lekérdezések definiálhatóak itt, ha szükséges.
}
