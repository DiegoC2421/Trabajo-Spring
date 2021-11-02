package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Producers",
	indexes= {@Index(columnList="producer_name",name="producers_index_producer_name")})
public class Producer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producer_id", columnDefinition = "NUMERIC(4)")
	private Integer id;

	@Column(name = "producer_name")
	private Integer name;

	@Column(name = "phone", columnDefinition = "NUMERIC(9)")
	private Integer phone;

	@Column(name = "email", length = 20)
	private String email;

	@ManyToOne
	@JoinColumn(name = "district_id", nullable = false)
	private District district;
	
	@OneToMany(mappedBy = "producer", fetch = FetchType.LAZY)
	private List<Product> products;
}
