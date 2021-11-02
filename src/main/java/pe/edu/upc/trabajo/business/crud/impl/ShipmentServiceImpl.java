package pe.edu.upc.trabajo.business.crud.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.business.crud.ShipmentService;
import pe.edu.upc.trabajo.models.entities.Shipment;
import pe.edu.upc.trabajo.models.repository.ShipmentRepository;

public class ShipmentServiceImpl implements ShipmentService {

	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Override
	public JpaRepository<Shipment, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return shipmentRepository;
	}

	@Override
	public List<Shipment> findByDate(Date date) throws Exception {
		// TODO Auto-generated method stub
		return shipmentRepository.findByDate(date);
	}

	@Override
	public List<Shipment> findByTypeShipping(Integer typeShipment) throws Exception {
		// TODO Auto-generated method stub
		return shipmentRepository.findByTypeShipping(typeShipment);
	}

}
