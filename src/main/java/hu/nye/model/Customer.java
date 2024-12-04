package hu.nye.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a customer entity in the database.
 * This entity stores information about a customer, including name, address, email,
 * and associated invoices, transactions, and products.
 */
@Entity
public class Customer {

    /**
     * Unique identifier for the customer, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    /**
     * Name of the customer.
     */
    private String name;

    /**
     * Address of the customer.
     */
    private String address;

    /**
     * Email address of the customer.
     */
    private String email;

    /**
     * List of invoices associated with the customer.
     * This relationship is mapped by the "customer" field in the {@link Invoice} class.
     */
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invoice> invoices;

    /**
     * List of transactions associated with the customer.
     * This relationship is mapped by the "customer" field in the {@link Transaction} class.
     */
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactions;

    /**
     * List of products associated with the customer.
     * This relationship is mapped by the "customer" field in the {@link Product} class.
     */
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;

    /**
     * Default constructor for the Customer class.
     */
    public Customer() {
    }

    // Getters and Setters

    /**
     * Retrieves the customer's unique ID.
     *
     * @return the customer's ID.
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Retrieves the customer's name.
     *
     * @return the customer's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer's name.
     *
     * @param name the new name for the customer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the customer's address.
     *
     * @return the customer's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the customer's address.
     *
     * @param address the new address for the customer.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the customer's email address.
     *
     * @return the customer's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the customer's email address.
     *
     * @param email the new email address for the customer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the list of invoices associated with the customer.
     *
     * @return the list of invoices.
     */
    public List<Invoice> getInvoices() {
        return invoices;
    }

    /**
     * Sets the list of invoices associated with the customer.
     *
     * @param invoices the new list of invoices.
     */
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    /**
     * Retrieves the list of transactions associated with the customer.
     *
     * @return the list of transactions.
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * Sets the list of transactions associated with the customer.
     *
     * @param transactions the new list of transactions.
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * Retrieves the list of products associated with the customer.
     *
     * @return the list of products.
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets the list of products associated with the customer.
     *
     * @param products the new list of products.
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
