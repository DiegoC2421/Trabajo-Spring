package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Integer> {
	List<Producer> findByFirstnameContaining(String name) throws Exception;
}
