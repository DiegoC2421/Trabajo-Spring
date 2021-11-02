package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Comments")
public class Comment {
	//FALTA ANADIR POR QUE ES DE 1 A 1
	
	@OneToMany(mappedBy = "comment", fetch = FetchType.LAZY)
	private List<Review> reviews;
	
	//FALTA GENERAR SUPERCLASE Y GETTTER Y SETTERS
}
