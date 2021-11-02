package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	List<Category> findByName(String name) throws Exception;
}
