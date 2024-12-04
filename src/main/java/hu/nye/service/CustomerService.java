package hu.nye.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import hu.nye.repository.CustomerRepository;
import hu.nye.model.Customer;

/**
 * Service class for managing customer operations.
 * This class interacts with the CustomerRepository to perform CRUD operations.
 */
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    /**
     * Constructs a CustomerService with the specified CustomerRepository.
     *
     * @param customerRepository The repository used for customer data operations.
     */
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retrieves all customers from the repository.
     *
     * @return A list of all customers.
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    /**
     * Retrieves a customer by their ID.
     *
     * @param id The ID of the customer to retrieve.
     * @return The customer object if found, or null if not found.
     */
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    /**
     * Saves a customer to the repository.
     * If the customer already exists, it updates the existing customer.
     *
     * @param customer The customer to be saved.
     * @return The saved customer object.
     */
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    /**
     * Deletes a customer from the repository by their ID.
     *
     * @param id The ID of the customer to delete.
     */
    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
