package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
public class providedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double price;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false)
    private booking booking;


	public providedService(Long id, String name, String description, double price, Model.booking booking) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.booking = booking;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public booking getBooking() {
		return booking;
	}


	public void setBooking(booking booking) {
		this.booking = booking;
	}


	@Override
	public String toString() {
		return "providedService [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", booking=" + booking + "]";
	}
    
	
}
