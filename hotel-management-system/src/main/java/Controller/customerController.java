package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.customerService;

@Controller
@RequestMapping("/customers")
public class customerController {
    @Autowired
    private customerService customer_Service;

    // Implement controller methods
}