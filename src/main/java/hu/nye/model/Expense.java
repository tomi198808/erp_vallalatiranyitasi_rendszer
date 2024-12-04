package hu.nye.model;

import jakarta.persistence.*;

/**
 * Represents an expense entity in the database.
 * This entity stores information about an expense, including its amount, description, and associated invoice.
 */
@Entity
public class Expense {

    /**
     * Unique identifier for the expense, generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer expenseId;

    /**
     * The amount of the expense.
     */
    private Double amount;

    /**
     * Description of the expense.
     */
    private String description;

    /**
     * The invoice associated with this expense.
     * This relationship is represented by a foreign key to the {@link Invoice} entity.
     */
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private Invoice invoice;

    // Getters and Setters

    /**
     * Retrieves the unique ID of the expense.
     *
     * @return the ID of the expense.
     */
    public Integer getExpenseId() {
        return expenseId;
    }

    /**
     * Retrieves the amount of the expense.
     *
     * @return the amount of the expense.
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * Sets the amount of the expense.
     *
     * @param amount the new amount for the expense.
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Retrieves the description of the expense.
     *
     * @return the description of the expense.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the expense.
     *
     * @param description the new description for the expense.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the associated invoice for this expense.
     *
     * @return the invoice associated with this expense.
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets the associated invoice for this expense.
     *
     * @param invoice the new invoice associated with this expense.
     */
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
