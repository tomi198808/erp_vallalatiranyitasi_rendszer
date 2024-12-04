package hu.nye.service;

import hu.nye.model.Invoice;
import hu.nye.model.User;
import hu.nye.model.Product;
import hu.nye.model.Expense;
import hu.nye.model.Report;
import java.util.List;

/**
 * Interface for financial services.
 * This interface defines methods for generating invoices, tracking expenses, and generating financial reports.
 */
public interface FinancialServiceInterface {

    /**
     * Generates an invoice for the specified user and products.
     *
     * @param user The user for whom the invoice is generated.
     * @param products The list of products to be included in the invoice.
     * @return The generated Invoice object.
     */
    Invoice generateInvoice(User user, List<Product> products);

    /**
     * Tracks a given expense.
     *
     * @param expense The expense to be tracked.
     */
    void trackExpense(Expense expense);

    /**
     * Generates a financial report summarizing the financial data.
     *
     * @return The generated Report object.
     */
    Report generateFinancialReport();
}
