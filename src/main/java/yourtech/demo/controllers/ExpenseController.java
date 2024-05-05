package yourtech.demo.controllers;
import yourtech.demo.services.*;
// import yourtech.demo.models.*;
// import yourtech.demo.services.Operations.*;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    // @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping
    public String showExpensesPage(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        return "products/expenses";
    }

    @PostMapping("/add")
    public String addExpense(@RequestParam String description,
                             @RequestParam LocalDate date,
                             @RequestParam Double price,
                             @RequestParam String category,
                             @RequestParam Long categoryId) {
        expenseService.addExpense(description, date, price, category, categoryId);
        return "redirect:/expenses";
    }

    @PostMapping("/edit/{id}")
    public String editExpense(@PathVariable Long id,
                              @RequestParam String description,
                              @RequestParam LocalDate date,
                              @RequestParam Double price,
                              @RequestParam String category,
                              @RequestParam Long categoryId) {
        expenseService.editExpense(id, description, date, price, category,categoryId);
        return "redirect:/expenses";
    }

    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
}