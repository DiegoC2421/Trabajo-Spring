package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.TypePayment;

public interface TypePaymentRepository extends JpaRepository<TypePayment, Integer> {
	List<TypePayment> findByName(String name) throws Exception;
}
