package hu.nye.service;

import hu.nye.model.Report;
import hu.nye.model.User;
import hu.nye.model.Product;
import hu.nye.model.Expense;
import hu.nye.model.Invoice;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the FinancialService class.
 */
class FinancialServiceTest {

    private final FinancialService financialService = new FinancialService();

    /**
     * Tests the generation of an invoice.
     *
     * Verifies that an invoice is successfully generated for a given user
     * and a list of products. The invoice should not be null.
     */
    @Test
    void testGenerateInvoice() {
        User user = new User();
        List<Product> products = Arrays.asList(new Product("Product1", 10.0), new Product("Product2", 20.0));

        Invoice invoice = financialService.generateInvoice(user, products);

        assertNotNull(invoice);
    }

    /**
     * Tests the tracking of an expense.
     *
     * Verifies that tracking an expense does not throw any exceptions.
     */
    @Test
    void testTrackExpense() {
        Expense expense = new Expense();

        assertDoesNotThrow(() -> financialService.trackExpense(expense));
    }

    /**
     * Tests the generation of a financial report.
     *
     * Verifies that a financial report is successfully generated. The report
     * should not be null.
     */
    @Test
    void testGenerateFinancialReport() {
        Report report = financialService.generateFinancialReport();

        assertNotNull(report);
    }
}
