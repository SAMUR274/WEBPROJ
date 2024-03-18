package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private Long roomId;
    private Date startDate;
    private Date endDate;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private customer customer;
    
    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<providedService> providedServices = new HashSet<>();
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false)
    private room room;

	public booking(Long id, Long customerId, Long roomId, Date startDate, Date endDate, Model.customer customer,
			Set<providedService> providedServices, Model.room room) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.roomId = roomId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer = customer;
		this.providedServices = providedServices;
		this.room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public customer getCustomer() {
		return customer;
	}

	public void setCustomer(customer customer) {
		this.customer = customer;
	}

	public Set<providedService> getProvidedServices() {
		return providedServices;
	}

	public void setProvidedServices(Set<providedService> providedServices) {
		this.providedServices = providedServices;
	}

	public room getRoom() {
		return room;
	}

	public void setRoom(room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "booking [id=" + id + ", customerId=" + customerId + ", roomId=" + roomId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", customer=" + customer + ", providedServices=" + providedServices
				+ ", room=" + room + "]";
	}

}

