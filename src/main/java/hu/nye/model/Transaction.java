package hu.nye.model;

import java.util.List;
import jakarta.persistence.*;
import java.util.Date;

/**
 * Represents a transaction entity in the application.
 * This entity stores information about a transaction, including the transaction date,
 * total amount, associated customer, and the list of products involved.
 */
@Entity
public class Transaction {

    /**
     * Unique identifier for the transaction, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    /**
     * The date of the transaction.
     */
    @SuppressWarnings("deprecation")
    @Temporal(TemporalType.DATE)
    private Date transactionDate;

    /**
     * The total amount of the transaction.
     */
    private Double totalAmount;

    /**
     * The customer associated with this transaction.
     * This relationship is managed by a foreign key to the {@link Customer} entity.
     */
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    /**
     * List of products involved in this transaction.
     * This is a many-to-many relationship with the {@link Product} entity.
     */
    @ManyToMany
    @JoinTable(
            name = "transaction_product",
            joinColumns = @JoinColumn(name = "transaction_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    /**
     * Default constructor for the Transaction class.
     */
    public Transaction() {
    }

    /**
     * Constructs a Transaction with the specified date, total amount, customer, and products.
     *
     * @param transactionDate the date of the transaction.
     * @param totalAmount     the total amount of the transaction.
     * @param customer        the customer associated with the transaction.
     * @param products        the list of products involved in the transaction.
     */
    public Transaction(Date transactionDate, Double totalAmount, Customer customer, List<Product> products) {
        this.transactionDate = transactionDate;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.products = products;
    }

    // Getters and Setters

    /**
     * Retrieves the unique ID of the transaction.
     *
     * @return the ID of the transaction.
     */
    public Integer getTransactionId() {
        return transactionId;
    }

    /**
     * Retrieves the date of the transaction.
     *
     * @return the transaction date.
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the date of the transaction.
     *
     * @param transactionDate the new date for the transaction.
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * Retrieves the total amount of the transaction.
     *
     * @return the total amount of the transaction.
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount of the transaction.
     *
     * @param totalAmount the new total amount for the transaction.
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Retrieves the customer associated with this transaction.
     *
     * @return the customer of the transaction.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with this transaction.
     *
     * @param customer the new customer for the transaction.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Retrieves the list of products involved in this transaction.
     *
     * @return the list of products in the transaction.
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets the list of products involved in this transaction.
     *
     * @param products the new list of products for the transaction.
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Returns a string representation of the Transaction.
     *
     * @return a string with transaction details.
     */
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", transactionDate=" + transactionDate +
                ", totalAmount=" + totalAmount +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
