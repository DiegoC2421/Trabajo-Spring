package pe.edu.upc.trabajo.business.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.business.crud.ProducerService;
import pe.edu.upc.trabajo.models.entities.Producer;
import pe.edu.upc.trabajo.models.repository.ProducerRepository;

public class PoducerServiceImpl implements ProducerService {

	@Autowired
	private ProducerRepository producerRepository;
	
	@Override
	public JpaRepository<Producer, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return producerRepository;
	}

	@Override
	public List<Producer> findByFirstnameContaining(String name) throws Exception {
		// TODO Auto-generated method stub
		return producerRepository.findByFirstnameContaining(name);
	}

}
