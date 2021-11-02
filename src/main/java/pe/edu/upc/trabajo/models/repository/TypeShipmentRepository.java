package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.TypeShipment;

public interface TypeShipmentRepository extends JpaRepository<TypeShipment, Integer> {
	List<TypeShipment> findByName(String name) throws Exception;
}
