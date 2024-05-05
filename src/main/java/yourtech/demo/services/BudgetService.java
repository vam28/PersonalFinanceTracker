package yourtech.demo.services;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yourtech.demo.models.Observor.*;
import yourtech.demo.models.entity.*;

import yourtech.demo.models.repository.CategoryRepository;

import java.util.List;

@Service
public class BudgetService {

    private final CategoryRepository categoryRepository;
    private final BudgetSubject budgetSubject;
    private final GoalObserver goalObserver;

    //@Autowired
    public BudgetService(CategoryRepository categoryRepository, BudgetSubject budgetSubject, GoalObserver goalObserver) {
        this.categoryRepository = categoryRepository;
        this.budgetSubject = budgetSubject;
        this.goalObserver = goalObserver;
        budgetSubject.registerObserver(goalObserver);
    }

    public Category addCategory(String name, Double budget,Long catId) {
        Category category = new Category(name, budget,catId);
        category = categoryRepository.save(category);
        budgetSubject.setCategory(category);
        return category;
    }

    public Category updateCategory(Long id, String name, Double budget, Long catId) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));
    
        category.setName(name);
        category.setBudget(budget);
        category.setCatId(catId);
    
        category = categoryRepository.save(category);
    
        budgetSubject.setCategory(category);
    
        // Update the goalAchieved status using the GoalObserver
        goalObserver.update(category);
    
        return category;
    }

    // public Category updateCategory(Long id,String name, Double budget,Long catId) {
    //     Category category = categoryRepository.findById(id)
    //             .orElseThrow(() -> new RuntimeException("Category not found"));
        
        
    //     category.setName(name);
    //     category.setBudget(budget);
    //     category.setCatId(catId);
    //     category = categoryRepository.save(category);
        
    //     budgetSubject.setCategory(category);
        
    //     return category;
    // }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
