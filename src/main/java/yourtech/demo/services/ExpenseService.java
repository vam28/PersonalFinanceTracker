package yourtech.demo.services;
import yourtech.demo.services.Operations.*;
import yourtech.demo.models.entity.*;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yourtech.demo.models.repository.ExpenseRepository;
import yourtech.demo.services.Operations.ExpenseOperationFactory;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseOperationFactory expenseOperationFactory;

    //@Autowired
    public ExpenseService(ExpenseRepository expenseRepository, ExpenseOperationFactory expenseOperationFactory) {
        this.expenseRepository = expenseRepository;
        this.expenseOperationFactory = expenseOperationFactory;
    }

    public Expense addExpense(String description, LocalDate date, Double price, String category,Long categoryId) {
        ExpenseOperations expenseOperation = expenseOperationFactory.getExpenseOperation(ExpenseOperationType.ADD);
        return expenseOperation.addExpense(description, date, price, category,categoryId);
    }

    public Expense editExpense(Long id, String description, LocalDate date, Double price, String category,Long categoryId) {
        ExpenseOperations expenseOperation = expenseOperationFactory.getExpenseOperation(ExpenseOperationType.EDIT);
        return expenseOperation.editExpense(id, description, date, price, category, categoryId);
    }

    public void deleteExpense(Long id) {
        ExpenseOperations expenseOperation = expenseOperationFactory.getExpenseOperation(ExpenseOperationType.DELETE);
        expenseOperation.deleteExpense(id);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
