// package yourtech.demo.models.entity;

// //import javax.persistence.*;

// import jakarta.persistence.*;

// import java.time.LocalDate;

// @Entity
// @Table(name = "expenses")
// public class Expense {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false)
//     private String description;

//     @Column(nullable = false)
//     private LocalDate date;

//     @Column(nullable = false)
//     private Double price;

//     @Column(nullable = false)
//     private String category;

//     // Constructors, getters, and setters

//     // ... (omitted for brevity)
// }

package yourtech.demo.models.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String category;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(nullable = false)
    private boolean goalAchieved;


    // Default constructor
    public Expense() {
    }

    // Constructor with all fields
    public Expense(String description, LocalDate date, Double price, String category,Long categoryId) {
        this.description = description;
        this.date = date;
        this.price = price;
        this.category = category;
        this.categoryId = categoryId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    
}