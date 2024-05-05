package yourtech.demo.controllers;
import yourtech.demo.services.*;
//import yourtech.demo.models.entity.*;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
//import yourtech.demo.services.Operations.*;

@Controller
@RequestMapping("/budget")
public class BudgetController {

    private final BudgetService budgetService;

    //@Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @GetMapping
    public String showBudgetPage(Model model) {
        model.addAttribute("categories", budgetService.getAllCategories());
        return "products/budget";
    }

    @PostMapping("/add")
    public String addCategory(@RequestParam String name, @RequestParam Double budget,@RequestParam Long catId ) {
        budgetService.addCategory(name,budget,catId);
        return "redirect:/budget";
    }

    @PostMapping("/update/{id}")
    public String updateCategory(@PathVariable Long id,
                                 @RequestParam String name,
                                 @RequestParam Double budget,
                                 @RequestParam Long catId) {
        budgetService.updateCategory( id,name, budget,catId);
        return "redirect:/budget";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        budgetService.deleteCategory(id);
        return "redirect:/budget";
    }
}
