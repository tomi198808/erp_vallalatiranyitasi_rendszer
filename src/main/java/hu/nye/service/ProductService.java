package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hu.nye.repository.ProductRepository;
import java.util.List;
import hu.nye.model.Product;

/**
 * Service class for managing product operations.
 * This class provides methods to interact with the product repository.
 */
@Service
public class ProductService {
    private final ProductRepository productRepository;

    /**
     * Constructor for ProductService.
     *
     * @param productRepository The repository to handle product data.
     */
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Retrieves all products from the repository.
     *
     * @return A list of all products.
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Retrieves a product by its ID.
     *
     * @param id The ID of the product to retrieve.
     * @return The product with the specified ID, or null if not found.
     */
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    /**
     * Adds a new product to the repository.
     *
     * @param product The product to be added.
     * @return The saved product.
     */
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Deletes a product from the repository by its ID.
     *
     * @param id The ID of the product to delete.
     */
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
