package pe.edu.upc.trabajo.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Shipments", 
		indexes = { @Index(columnList = "date", name = "shipments_index_date"),
					@Index(columnList = "typeShipping_id", name = "shipments_index_typeShipping_id")})
public class Shipment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "shipment_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	//ACÁ LA RELACIÓN CON ORDER
	
	//
	
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name = "address", length = 20)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "typeShipping_id", nullable = false)
	private TypeShipment typeShipment;
	
	//FALTA CREAR LA SUPERCLASE, GETTER Y SETTERS
}
