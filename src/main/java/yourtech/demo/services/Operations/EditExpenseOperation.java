package yourtech.demo.services.Operations;
import yourtech.demo.models.entity.*;
import yourtech.demo.models.repository.*;

import java.time.LocalDate;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EditExpenseOperation implements ExpenseOperations {

    private final ExpenseRepository expenseRepository;

    //@Autowired
    public EditExpenseOperation(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense editExpense(Long id, String description, LocalDate date, Double price, String category,Long categoryId) {
        Expense expense = expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        expense.setDescription(description);
        expense.setDate(date);
        expense.setPrice(price);
        expense.setCategory(category);
        expense.setCategoryId(categoryId);

        return expenseRepository.save(expense);
    }

    // Other methods not needed for this implementation
    @Override
    public Expense addExpense(String description, LocalDate date, Double price, String category,Long categoryId) {
        return null;
    }

    @Override
    public void deleteExpense(Long id) {
        // No implementation needed
    }
}
