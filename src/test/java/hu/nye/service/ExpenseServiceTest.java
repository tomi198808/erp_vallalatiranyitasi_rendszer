package hu.nye.service;

import hu.nye.model.Expense;
import hu.nye.repository.ExpenseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Unit tests for the ExpenseService class.
 */
class ExpenseServiceTest {

    @Mock
    private ExpenseRepository expenseRepository;

    @InjectMocks
    private ExpenseService expenseService;

    /**
     * Initializes the mocks before each test.
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Tests the retrieval of all expenses.
     *
     * Verifies that the service correctly returns a list of expenses and
     * that the repository's findAll method is called exactly once.
     */
    @Test
    void testGetAllExpenses() {
        Expense expense1 = new Expense();
        Expense expense2 = new Expense();
        when(expenseRepository.findAll()).thenReturn(Arrays.asList(expense1, expense2));

        List<Expense> expenses = expenseService.getAllExpenses();

        assertEquals(2, expenses.size());
        verify(expenseRepository, times(1)).findAll();
    }

    /**
     * Tests the retrieval of a specific expense by its ID.
     *
     * Verifies that the service returns a non-null expense when it exists
     * and that the repository's findById method is called exactly once.
     */
    @Test
    void testGetExpenseById() {
        Expense expense = new Expense();
        when(expenseRepository.findById(1)).thenReturn(Optional.of(expense));

        Expense result = expenseService.getExpenseById(1);

        assertNotNull(result);
        verify(expenseRepository, times(1)).findById(1);
    }

    /**
     * Tests the addition of a new expense.
     *
     * Verifies that the service returns the added expense and that the
     * repository's save method is called exactly once.
     */
    @Test
    void testAddExpense() {
        Expense expense = new Expense();
        when(expenseRepository.save(expense)).thenReturn(expense);

        Expense result = expenseService.addExpense(expense);

        assertNotNull(result);
        verify(expenseRepository, times(1)).save(expense);
    }

    /**
     * Tests the deletion of an expense by its ID.
     *
     * Verifies that the repository's deleteById method is called exactly
     * once for the specified expense ID.
     */
    @Test
    void testDeleteExpense() {
        doNothing().when(expenseRepository).deleteById(1);

        expenseService.deleteExpense(1);

        verify(expenseRepository, times(1)).deleteById(1);
    }
}
