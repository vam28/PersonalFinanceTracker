package yourtech.demo.models.repository;
import yourtech.demo.models.entity.*;
// Import necessary packages
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Define the Income repository
@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
    // No custom methods required for this example
}
