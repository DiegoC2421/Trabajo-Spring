package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Wholesaler;

public interface WholesalerRepository extends JpaRepository<Wholesaler, Integer> {
	List<Wholesaler> findByName(String name) throws Exception;
}
