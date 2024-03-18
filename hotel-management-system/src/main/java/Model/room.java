package Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber;
    private String type;
    private int price;
    
    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<booking> bookings = new HashSet<>();

	public room(Long id, String roomNumber, String type, int price, Set<booking> bookings) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.type = type;
		this.price = price;
		this.bookings = bookings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<booking> getBookings() {
		return bookings;
	}

	public void setBookings(Set<booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "room [id=" + id + ", roomNumber=" + roomNumber + ", type=" + type + ", price=" + price + ", bookings="
				+ bookings + "]";
	}
	
	
}
