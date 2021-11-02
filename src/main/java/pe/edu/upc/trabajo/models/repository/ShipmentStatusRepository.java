package pe.edu.upc.trabajo.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Shipment;
import pe.edu.upc.trabajo.models.entities.ShipmentStatus;
import pe.edu.upc.trabajo.models.entities.ShipmentStatusId;
import pe.edu.upc.trabajo.models.entities.Status;

public interface ShipmentStatusRepository extends JpaRepository<ShipmentStatus, ShipmentStatusId>{
	List<ShipmentStatus> findByStatus(Status status) throws Exception;
	List<ShipmentStatus> findByShipment(Shipment shipment) throws Exception;
}
