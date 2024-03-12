package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.roomService;

@Controller
@RequestMapping("/rooms")
public class roomController {
    @Autowired
    private roomService room_Service;

    // Implement controller methods
}