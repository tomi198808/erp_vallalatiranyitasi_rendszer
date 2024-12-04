package hu.nye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hu.nye.service.CustomerService;
import hu.nye.model.Customer;
import java.util.List;

/**
 * REST Controller for managing customer-related operations.
 * Provides endpoints for creating, retrieving, and deleting customers.
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * Retrieves all customers.
     *
     * @return a list of all {@link Customer} objects.
     */
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    /**
     * Retrieves a specific customer by ID.
     *
     * @param id the ID of the customer to retrieve.
     * @return a {@link ResponseEntity} containing the customer if found, or a "not found" status otherwise.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
        Customer customer = customerService.getCustomerById(id);
        return customer != null ? ResponseEntity.ok(customer) : ResponseEntity.notFound().build();
    }

    /**
     * Creates a new customer.
     *
     * @param customer the customer object to create.
     * @return the created {@link Customer} object.
     */
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    /**
     * Deletes a customer by ID.
     *
     * @param id the ID of the customer to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }
}
