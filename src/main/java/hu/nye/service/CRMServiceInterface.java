package hu.nye.service;

import hu.nye.model.Customer;

/**
 * Interface defining the operations for managing customer relationships in the CRM system.
 */
public interface CRMServiceInterface {

    /**
     * Adds a new customer to the CRM system.
     *
     * @param customer The customer to be added.
     */
    void addCustomer(Customer customer);

    /**
     * Removes an existing customer from the CRM system.
     *
     * @param customer The customer to be removed.
     */
    void removeCustomer(Customer customer);

    /**
     * Retrieves the details of a customer by their ID.
     *
     * @param customerId The ID of the customer to retrieve.
     * @return The customer object if found, or null if not found.
     */
    Customer getCustomerDetails(Integer customerId);
}
