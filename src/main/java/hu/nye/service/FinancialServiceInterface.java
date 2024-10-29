public interface FinancialServiceInterface {
    Invoice generateInvoice(User user, List<Product> products);
    void trackExpense(Expense expense);
    Report generateFinancialReport();
}