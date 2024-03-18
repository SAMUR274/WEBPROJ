package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import Model.booking;
import Model.customer;
import Model.providedService;
import java.util.List;
import java.util.Optional;
import Service.bookingService;

@Controller
@RequestMapping("/bookings")
public class bookingController {
    @Autowired
    private bookingService booking_Service;

	public bookingController(bookingService booking_Service) {
		super();
		this.booking_Service = booking_Service;
	}
    
	 @GetMapping("/")
	    public List<booking> getAllBookings() {
	        return booking_Service.getAllBookings();
	    }

	    @GetMapping("/{id}")
	    public Optional<booking> getBookingById(@PathVariable Long id) {
	        return booking_Service.getBookingById(id);
	    }

	    @PostMapping("/")
	    public booking saveBooking(@RequestBody booking booking) {
	        return booking_Service.saveOrUpdateBooking(booking);
	    }

	    @PutMapping("/{id}")
	    public booking updateBooking(@PathVariable Long id, @RequestBody booking bookingDetails) {
	    	 Optional<booking> optionalBooking = booking_Service.getBookingById(id);
	         if (optionalBooking.isPresent()) {
	             booking booking = optionalBooking.get();
	             
	             booking.setCustomerId(bookingDetails.getCustomerId());
	             booking.setRoomId(bookingDetails.getRoomId());
	             booking.setStartDate(bookingDetails.getStartDate());
	             booking.setEndDate(bookingDetails.getEndDate());
	         
	             return booking_Service.saveOrUpdateBooking(booking);
	         } else {
	             // Handle customer not found
	             return null;
	         }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBooking(@PathVariable Long id) {
	    	booking_Service.deleteBooking(id);
	    }
	    
	    @PostMapping("/{bookingId}/provided-services")
	    public void addProvidedServiceToBooking(@PathVariable Long bookingId, @RequestBody providedService providedService) {
	    	booking_Service.addProvidedServiceToBooking(bookingId, providedService);
	    }

    // Implement controller methods
}