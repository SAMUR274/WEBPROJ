package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.bookingService;

@Controller
@RequestMapping("/bookings")
public class bookingController {
    @Autowired
    private bookingService booking_Service;

    // Implement controller methods
}