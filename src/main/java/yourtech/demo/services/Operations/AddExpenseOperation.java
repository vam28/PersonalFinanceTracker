package yourtech.demo.services.Operations;
import yourtech.demo.models.entity.*;
import yourtech.demo.models.repository.*;

import java.time.LocalDate;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddExpenseOperation implements ExpenseOperations {

    private final ExpenseRepository expenseRepository;

    
    public AddExpenseOperation(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense addExpense(String description, LocalDate date, Double price, String category,Long categoryId) {
        Expense expense = new Expense(description, date, price, category, categoryId);
        return expenseRepository.save(expense);
    }

    // Other methods not needed for this implementation
    @Override
    public Expense editExpense(Long id, String description, LocalDate date, Double price, String category, Long categoryId) {
        return null;
    }

    @Override
    public void deleteExpense(Long id) {
        // No implementation needed
    }
}
