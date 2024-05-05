// package yourtech.demo.models.entity;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "categories")
// public class Category {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     @Column(nullable = false, unique = true)
//     private String name;

//     @Column(nullable = false)
//     private Double budget;

//     // Constructors, getters, and setters

//     // ... (omitted for brevity)
// }


package yourtech.demo.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Double budget;

    @Column(nullable = false)
    private Long catId;

    @Column(nullable = false)
    private boolean goalAchieved;

    // Default constructor
    public Category() {
    }

    // Constructor with name and budget
    public Category(String name, Double budget,Long catId) {
        //this.id=id;
        this.name = name;
        this.budget = budget;
        this.catId=catId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;

    }


    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;

    }

    
    public boolean isGoalAchieved() {
        return goalAchieved;
    }

    public void setGoalAchieved(boolean goalAchieved) {
        this.goalAchieved = goalAchieved;
    }
}
