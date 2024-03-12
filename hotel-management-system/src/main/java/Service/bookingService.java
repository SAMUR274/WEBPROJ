package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.booking;
import Repository.bookingRepository;
import java.util.List;

@Service
public class bookingService {
    @Autowired
    private bookingRepository booking_Repository;

    // Implement service methods
}