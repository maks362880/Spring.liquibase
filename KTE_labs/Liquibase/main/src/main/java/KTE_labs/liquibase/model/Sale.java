package KTE_labs.liquibase.model;

import javax.persistence.*;
import java.math.BigDecimal;
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

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "final_price", nullable = false)
    private BigDecimal finalPrice;

    @Column(name = "final_discount_%", nullable = false)
    private int finalDiscountInPercent;

    public Sale() {
    }

    public Sale(int customerId, LocalDateTime date, int checkNumber, BigDecimal totalPrice, BigDecimal finalPrice, int finalDiscountInPercent) {
        this.customerId = customerId;
        this.date = date;
        this.checkNumber = checkNumber;
        this.totalPrice = totalPrice;
        this.finalPrice = finalPrice;
        this.finalDiscountInPercent = finalDiscountInPercent;
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

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getFinalDiscountInPercent() {
        return finalDiscountInPercent;
    }

    public void setFinalDiscountInPercent(int finalDiscountInPercent) {
        this.finalDiscountInPercent = finalDiscountInPercent;
    }
}
