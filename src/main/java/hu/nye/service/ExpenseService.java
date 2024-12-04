package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import hu.nye.repository.ExpenseRepository;
import hu.nye.model.Expense;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for managing expense operations.
 * This class interacts with the ExpenseRepository to perform CRUD operations on expenses.
 */
@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    /**
     * Constructs an ExpenseService with the specified ExpenseRepository.
     *
     * @param expenseRepository The repository used for expense data operations.
     */
    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    /**
     * Retrieves all expenses from the repository.
     *
     * @return A list of all expenses.
     */
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    /**
     * Retrieves an expense by its ID.
     *
     * @param id The ID of the expense to retrieve.
     * @return The expense object if found, or null if not found.
     */
    public Expense getExpenseById(Integer id) {
        return expenseRepository.findById(id).orElse(null);
    }

    /**
     * Adds a new expense to the repository.
     * If the expense already exists, it updates the existing expense.
     *
     * @param expense The expense to be added.
     * @return The saved expense object.
     */
    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    /**
     * Deletes an expense from the repository by its ID.
     *
     * @param id The ID of the expense to delete.
     */
    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
}
