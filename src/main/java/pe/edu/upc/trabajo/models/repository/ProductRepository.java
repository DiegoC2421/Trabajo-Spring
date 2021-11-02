package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Category;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.entities.ProductId;

public interface ProductRepository extends JpaRepository<Product, ProductId> {
	List<Product> findByCategory(Category category) throws Exception;
	List<Product> findByName(String name) throws Exception;
	List<Product> findByNameContaining(String name) throws Exception;
	
}
