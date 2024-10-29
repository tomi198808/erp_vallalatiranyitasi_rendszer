public class CRMService implements CRMServiceInterface {
    private Map<String, Customer> customers = new HashMap<>();

    @Override
    public void addCustomer(Customer customer) {
        customers.put(customer.getCustomerId(), customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer.getCustomerId());
    }

    @Override
    public Customer getCustomerDetails(String customerId) {
        return customers.get(customerId);
    }
}