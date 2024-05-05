package yourtech.demo.controllers;
import yourtech.demo.services.*;

//import yourtech.demo.models.*;
import yourtech.demo.models.entity.Income;
import yourtech.demo.models.repository.IncomeRepository;

// Import necessary packages
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Define the IncomeController
@Controller
@RequestMapping("/income")
public class IncomeController {

    // Inject the IncomeService
    private final IncomeService incomeService;

    // Constructor injection (Dependency Injection principle)
    //@Autowired
    public IncomeController(IncomeRepository incomeRepository) {
        this.incomeService = IncomeService.getInstance(incomeRepository);
    }

    // Mapping for the income page
    @GetMapping
    public String showIncomePage(Model model) {
        model.addAttribute("incomes", incomeService.getAllIncomes());
        return "products/income";
    }

    // Mapping for adding a new income
    @PostMapping("/add")
    public String addIncome(@ModelAttribute Income income) {
        incomeService.addIncome(income);
        return "redirect:/income";
    }

    // Mapping for editing an existing income
    @PostMapping("/edit/{id}")
    public String editIncome(@PathVariable Long id, @ModelAttribute Income income) {
        income.setId(id);
        incomeService.editIncome(income);
        return "redirect:/income";
    }

    // Mapping for deleting an income
    @GetMapping("/delete/{id}")
    public String deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
        return "redirect:/income";
    }
}
