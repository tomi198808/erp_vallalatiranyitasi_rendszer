package hu.nye.service;

import java.util.HashMap;
import java.util.Map;
import hu.nye.model.Customer;

/**
 * A service class for managing customer relationships in the CRM system.
 * Provides methods to add, remove, and retrieve customer details.
 */
public class CRMService implements CRMServiceInterface {
    private Map<Integer, Customer> customers = new HashMap<>();

    /**
     * Adds a new customer to the CRM system.
     *
     * @param customer The customer to be added.
     */
    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    /**
     * Removes an existing customer from the CRM system.
     *
     * @param customer The customer to be removed.
     */
    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer.getCustomerId());
    }

    /**
     * Retrieves the details of a customer by their ID.
     *
     * @param customerId The ID of the customer to retrieve.
     * @return The customer object if found, or null if not found.
     */
    @Override
    public Customer getCustomerDetails(Integer customerId) {
        return customers.get(customerId);
    }
}
