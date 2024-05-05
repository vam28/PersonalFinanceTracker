package yourtech.demo.models.entity;

// Import necessary packages
//import javax.persistence.*;

import jakarta.persistence.*;


import java.time.LocalDate;

// Define the Income entity
@Entity
@Table(name = "income")
public class Income {

    // Define the primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Define the amount column
    @Column(nullable = false)
    private Double amount;

    // Define the date column
    @Column(nullable = false)
    private LocalDate date;

    // Default constructor
    public Income() {
    }

    // Constructor with parameters
    public Income(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
