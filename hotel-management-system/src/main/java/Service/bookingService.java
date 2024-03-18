package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.*;
import Repository.bookingRepository;
import java.util.List;
import java.util.Optional;

@Service
public class bookingService {
    @Autowired
    private bookingRepository booking_Repository;

    public bookingService(bookingRepository booking_Repository) {
		super();
		this.booking_Repository = booking_Repository;
	}

	// Implement service methods
    // Method to save or update a booking
    public booking saveOrUpdateBooking(booking booking) {
        return booking_Repository.save(booking);
    }

    // Method to retrieve all bookings
    public List<booking> getAllBookings() {
        return booking_Repository.findAll();
    }

    // Method to retrieve a booking by its ID
    public Optional<booking> getBookingById(Long id) {
        return booking_Repository.findById(id);
    }

    // Method to delete a booking by its ID
    public void deleteBooking(Long id) {
        booking_Repository.deleteById(id);
    }
    
    
    // Manage provided services
    public void addProvidedServiceToBooking(Long bookingId, providedService providedService) {
        Optional<booking> optionalBooking = booking_Repository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            booking booking = optionalBooking.get();
            providedService.setBooking(booking);
            booking.getProvidedServices().add(providedService);
            booking_Repository.save(booking);
        } else {
            // Handle booking not found
        }
    }
}