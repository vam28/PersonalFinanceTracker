import org.springframework.stereotype.Component;

@Component
public class GoalObserver implements Observer {

    @Override
    public void update(Category category) {
        // Logic to check if the total expense for the category is within the budget
        Double totalExpense = getTotalExpenseForCategory(category.getId());

        if (totalExpense <= category.getBudget()) {
            System.out.println("Goal achieved for category: " + category.getName());
        } else {
            System.out.println("Goal not achieved for category: " + category.getName());
        }
    }

    // Helper method to get the total expense for a category
    private Double getTotalExpenseForCategory(Long categoryId) {
        // Implement logic to fetch the total expense for the given category
        // from the database or other data sources
        return 500.0; // Example value for demonstration
    }
}
