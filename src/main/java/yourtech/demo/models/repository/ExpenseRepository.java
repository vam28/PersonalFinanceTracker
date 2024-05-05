package yourtech.demo.models.repository;


import yourtech.demo.models.entity.*;
import org.springframework.data.jpa.repository.Query;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    @Query("SELECT SUM(e.price) FROM Expense e WHERE e.categoryId = :categoryId")
    Double sumExpensesByCategory(Long categoryId);

}
