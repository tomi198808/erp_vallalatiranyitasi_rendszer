package hu.nye.model;

import jakarta.persistence.*;
import java.util.Set;

/**
 * Represents a product entity in the database.
 * This entity stores information about a product, including its name, price, associated customer,
 * and transactions where it is included.
 */
@Entity
public class Product {

    /**
     * Unique identifier for the product, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    /**
     * The name of the product.
     */
    private String productName;

    /**
     * The price of the product.
     */
    private double price;

    /**
     * The customer associated with this product.
     * This relationship is managed by a foreign key to the {@link Customer} entity.
     */
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    /**
     * Set of transactions that include this product.
     * This is a many-to-many relationship mapped by the "products" field in the {@link Transaction} entity.
     */
    @ManyToMany(mappedBy = "products")
    private Set<Transaction> transactions;

    /**
     * Default constructor for the Product class.
     */
    public Product() {
    }

    /**
     * Constructs a Product with the specified name and price.
     *
     * @param productName the name of the product.
     * @param price       the price of the product.
     */
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Getters and Setters

    /**
     * Retrieves the unique ID of the product.
     *
     * @return the ID of the product.
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return the product name.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the name of the product.
     *
     * @param productName the new name for the product.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the price of the product.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     *
     * @param price the new price for the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves the customer associated with this product.
     *
     * @return the customer associated with the product.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with this product.
     *
     * @param customer the new customer for the product.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Retrieves the set of transactions that include this product.
     *
     * @return the set of transactions.
     */
    public Set<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Sets the set of transactions that include this product.
     *
     * @param transactions the new set of transactions for the product.
     */
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * Returns a string representation of the Product.
     *
     * @return a string with product details.
     */
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", customer=" + customer +
                ", transactions=" + transactions +
                '}';
    }
}
