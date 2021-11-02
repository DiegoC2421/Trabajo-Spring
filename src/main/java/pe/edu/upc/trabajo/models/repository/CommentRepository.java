package pe.edu.upc.trabajo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.trabajo.models.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
