package yourtech.demo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import yourtech.demo.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
