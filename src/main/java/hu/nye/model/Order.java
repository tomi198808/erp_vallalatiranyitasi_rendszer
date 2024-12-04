package hu.nye.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Represents an order entity in the database.
 * This entity stores information about an order, including the customer name and associated products.
 */
@Entity
@Table(name = "`order`")
public class Order {

    /**
     * Unique identifier for the order, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    /**
     * The name of the customer who placed the order.
     */
    private String customerName;

    /**
     * List of products associated with this order.
     * This relationship is managed by a foreign key in the Product entity.
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private List<Product> products;

    /**
     * Default constructor for the Order class.
     */
    public Order() {
    }

    /**
     * Constructor to initialize an Order with a customer name and list of products.
     *
     * @param customerName the name of the customer.
     * @param products the list of products in the order.
     */
    public Order(String customerName, List<Product> products) {
        this.customerName = customerName;
        this.products = products;
    }

    // Getters and Setters

    /**
     * Retrieves the unique ID of the order.
     *
     * @return the ID of the order.
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * Sets the unique ID of the order.
     *
     * @param orderId the new ID for the order.
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * Retrieves the name of the customer who placed the order.
     *
     * @return the customer's name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the name of the customer who placed the order.
     *
     * @param customerName the new customer name for the order.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Retrieves the list of products associated with this order.
     *
     * @return the list of products in the order.
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets the list of products associated with this order.
     *
     * @param products the new list of products for the order.
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
