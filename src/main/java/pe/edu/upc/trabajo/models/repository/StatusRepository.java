package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
