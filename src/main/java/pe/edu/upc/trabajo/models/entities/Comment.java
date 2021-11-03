package pe.edu.upc.trabajo.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Comments")
public class Comment {
	@Id
	@OneToOne
	@JoinColumn(name="producer_id")
	private Producer producer;
	
	@OneToMany(mappedBy = "comment", fetch = FetchType.LAZY)
	private List<Review> reviews;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producer getProducer() {
		return producer;
	}

	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
