package pe.edu.upc.trabajo.models.entities;

import java.io.Serializable;
import java.util.Objects;


public class DetailId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Order order;
	private Product product;
	private Producer producer;
	
	public DetailId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DetailId(Producer producer, Product product, Order order) {
		super();
		this.order = order;
		this.product = product;
		this.producer = producer;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, producer, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		
		DetailId cardId = (DetailId)obj;
		
		if(this.order != cardId.order)
			return false;
		if(this.product != cardId.product)
			return false;
		if(this.producer != cardId.producer)
			return false;
		return true;
	}
}
