public interface CRMServiceInterface {
    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    Customer getCustomerDetails(String customerId);
}