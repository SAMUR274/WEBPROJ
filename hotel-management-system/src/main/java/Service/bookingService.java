package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.booking;
import Repository.bookingRepository;
import java.util.List;
import java.util.Optional;

@Service
public class bookingService {
    @Autowired
    private bookingRepository booking_Repository;

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
}