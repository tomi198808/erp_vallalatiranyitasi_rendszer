package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import hu.nye.model.Invoice;
import hu.nye.repository.InvoiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Service class for managing invoice operations.
 * This class provides methods to interact with the invoice repository.
 */
@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    /**
     * Constructor for InvoiceService.
     *
     * @param invoiceRepository The repository to handle invoice data.
     */
    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    /**
     * Retrieves all invoices from the repository.
     *
     * @return A list of all invoices.
     */
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    /**
     * Retrieves an invoice by its ID.
     *
     * @param id The ID of the invoice to retrieve.
     * @return The invoice with the specified ID, or null if not found.
     */
    public Invoice getInvoiceById(Integer id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    /**
     * Adds a new invoice to the repository.
     *
     * @param invoice The invoice to be added.
     * @return The saved invoice.
     */
    public Invoice addInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    /**
     * Deletes an invoice from the repository by its ID.
     *
     * @param id The ID of the invoice to delete.
     */
    public void deleteInvoice(Integer id) {
        invoiceRepository.deleteById(id);
    }
}
