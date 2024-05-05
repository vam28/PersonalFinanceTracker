package yourtech.demo.models.repository;

import yourtech.demo.models.entity.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // No custom methods required for this example
}
