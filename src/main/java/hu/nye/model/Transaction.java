import java.util.List;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String transactionId;
	
	@Temporal(TemporalType.DATE)
    private Date transactionDate;
    
	private Double totalAmount;
	
	@ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
	
	@ManyToMany
    @JoinTable(
        name = "TransactionProduct",
        joinColumns = @JoinColumn(name = "transactionId"),
        inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> products; // Aggregációs kapcsolat

    // Konstruktor
    public Transaction(String transactionId, Date transactionDate, Customer customer, List<Product> products) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.customer = customer; // Hozzáadtuk a customer mezőt
        this.products = products;
    }

    // Getterek és setterek
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() { // Getter a customer mezőhöz
        return customer;
    }

    public void setCustomer(Customer customer) { // Setter a customer mezőhöz
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // toString metódus
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionDate=" + transactionDate +
                ", totalAmount=" + totalAmount +
                ", customer=" + customer + // Hozzáadtuk a customer mezőt a toString-hez
                ", products=" + products +
                '}';
    }
}
