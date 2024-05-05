package yourtech.demo.services.Operations;
import java.time.LocalDate;

import yourtech.demo.models.entity.*;

public interface ExpenseOperations {
    Expense addExpense(String description, LocalDate date, Double price, String category,Long categoryId);
    Expense editExpense(Long id, String description, LocalDate date, Double price, String category,Long categoryId);
    void deleteExpense(Long id);
}
