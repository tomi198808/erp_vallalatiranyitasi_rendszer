import javax.persistence.*;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer expenseId;

    private Double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private Invoice invoice;

    // Getterek és Setterek
}