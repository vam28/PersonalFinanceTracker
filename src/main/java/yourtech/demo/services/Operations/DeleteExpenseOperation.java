package yourtech.demo.services.Operations;
import yourtech.demo.models.repository.*;
import yourtech.demo.models.entity.*;

import java.time.LocalDate;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteExpenseOperation implements ExpenseOperations {

    private final ExpenseRepository expenseRepository;

    //@Autowired
    public DeleteExpenseOperation(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }

    // Other methods not needed for this implementation
    @Override
    public Expense addExpense(String description, LocalDate date, Double price, String category, Long categoryId) {
        return null;
    }

    @Override
    public Expense editExpense(Long id, String description, LocalDate date, Double price, String category,Long categoryId) {
        return null;
    }
}
