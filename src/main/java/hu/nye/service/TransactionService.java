package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import hu.nye.repository.TransactionRepository;
import hu.nye.model.Transaction;

/**
 * Service class for managing transactions in the application.
 * This class provides methods for transaction operations, including retrieval, creation, and deletion.
 */
@Service
public class TransactionService {
    private TransactionRepository transactionRepository;

    /**
     * Constructor for TransactionService.
     *
     * @param transactionRepository The repository used to handle transaction data.
     */
    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    /**
     * Retrieves all transactions from the repository.
     *
     * @return A list of all transactions.
     */
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    /**
     * Retrieves a transaction by its ID.
     *
     * @param id The ID of the transaction to retrieve.
     * @return The transaction with the specified ID, or null if not found.
     */
    public Transaction getTransactionById(Integer id) {
        return transactionRepository.findById(id).orElse(null);
    }

    /**
     * Saves a new transaction or updates an existing one.
     *
     * @param transaction The transaction to be saved.
     * @return The saved transaction.
     */
    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    /**
     * Deletes a transaction from the repository by its ID.
     *
     * @param id The ID of the transaction to delete.
     */
    public void deleteTransaction(Integer id) {
        transactionRepository.deleteById(id);
    }
}
