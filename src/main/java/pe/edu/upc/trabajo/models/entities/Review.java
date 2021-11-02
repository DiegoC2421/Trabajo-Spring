package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Reviews", 
		indexes = { @Index(columnList = "qualification", name = "reviews_index_qualification"),
				@Index(columnList = "date", name = "reviews_index_date")})
@IdClass(ReviewId.class)
public class Review {
	
	//ACÁ PONER SU RELACIÓN 1 A 1 CON COMMENTS
	
	//
	
	@ManyToOne
	@JoinColumn(name = "wholesaler_id", nullable = false)
	private Wholesaler wholesaler;
	
	@Column(name = "review_description", length = 20)
	private String description;
	
	@Column(name = "qualification", columnDefinition = "NUMERIC(5)")
	private Integer qualification;
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	//GENERAR GETTERS Y SETTERS
	
}
