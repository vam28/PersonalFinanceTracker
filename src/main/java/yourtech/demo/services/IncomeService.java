package yourtech.demo.services;
import yourtech.demo.models.entity.*;

// Import necessary packages
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yourtech.demo.models.repository.IncomeRepository;

import java.util.List;

// Define the IncomeSe Private staticrvice as a singleton
@Service
public class IncomeService {

    // Inject the IncomeRepository using constructor injection (Dependency Injection principle)
    private final IncomeRepository incomeRepository;

    // instance of the IncomeService
    private static IncomeService instance;

    // Private constructor to restrict instantiation from outside the class
    //@Autowired
    private IncomeService(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    // Static method to get the instance of the IncomeService
    public static IncomeService getInstance(IncomeRepository incomeRepository) {
        if (instance == null) {
            instance = new IncomeService(incomeRepository);
        }
        return instance;
    }

    // Method to add a new income
    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }

    // Method to edit an existing income
    public Income editIncome(Income income) {
        return incomeRepository.save(income);
    }

    // Method to delete an income
    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }

    // Method to get all incomes
    public List<Income> getAllIncomes() {
        return incomeRepository.findAll();
    }
}
