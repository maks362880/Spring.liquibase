package KTE_labs.liquibase.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "sale_date", nullable = false)
    private LocalDateTime date;

    @Column(name = "check_number", nullable = false)
    private int checkNumber;


    public Sale() {
    }

    public Sale(int customerId, LocalDateTime date, int checkNumber) {
        this.customerId = customerId;
        this.date = date;
        this.checkNumber = checkNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

}
