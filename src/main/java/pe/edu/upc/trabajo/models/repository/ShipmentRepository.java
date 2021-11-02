package pe.edu.upc.trabajo.models.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Integer> {
	List<Shipment> findByDate(Date date) throws Exception;
	List<Shipment> findByTypeShipping(Integer typeShipment) throws Exception;
}
