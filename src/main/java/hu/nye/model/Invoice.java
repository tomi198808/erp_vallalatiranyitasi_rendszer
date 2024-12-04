package hu.nye.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Represents an invoice entity in the database.
 * This entity stores information about an invoice, including its date, total amount, associated customer,
 * list of products, and list of expenses.
 */
@Entity
public class Invoice {

    /**
     * Unique identifier for the invoice, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoiceId;

    /**
     * The date when the invoice was issued.
     */
    @Temporal(TemporalType.DATE)
    private Date date;

    /**
     * The total amount for this invoice.
     */
    private Double totalAmount;

    /**
     * List of products associated with this invoice.
     * This relationship is managed by a foreign key in the Product entity.
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
    private List<Product> products;

    /**
     * The customer associated with this invoice.
     * This relationship is managed by a foreign key to the {@link Customer} entity.
     */
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    /**
     * List of expenses associated with this invoice.
     * Each expense is linked to this invoice through the "invoice" field in the {@link Expense} class.
     */
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Expense> expenses;

    // Constructors, Getters, and Setters

    /**
     * Default constructor for the Invoice class.
     */
    public Invoice() {
    }

    /**
     * Retrieves the unique ID of the invoice.
     *
     * @return the ID of the invoice.
     */
    public Integer getInvoiceId() {
        return invoiceId;
    }

    /**
     * Retrieves the date when the invoice was issued.
     *
     * @return the date of the invoice.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date when the invoice was issued.
     *
     * @param date the new date for the invoice.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Retrieves the total amount for this invoice.
     *
     * @return the total amount of the invoice.
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount for this invoice.
     *
     * @param totalAmount the new total amount for the invoice.
     */
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Retrieves the list of products associated with this invoice.
     *
     * @return the list of products.
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets the list of products associated with this invoice.
     *
     * @param products the new list of products for this invoice.
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Retrieves the customer associated with this invoice.
     *
     * @return the customer of the invoice.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with this invoice.
     *
     * @param customer the new customer for this invoice.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Retrieves the list of expenses associated with this invoice.
     *
     * @return the list of expenses.
     */
    public List<Expense> getExpenses() {
        return expenses;
    }

    /**
     * Sets the list of expenses associated with this invoice.
     *
     * @param expenses the new list of expenses for this invoice.
     */
    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
