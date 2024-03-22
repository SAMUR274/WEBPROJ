package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.providedServiceService;

@Controller
@RequestMapping("/services")
public class providedServiceController {
    @Autowired
    private providedServiceService providedService_Service;

	public providedServiceController(providedServiceService providedService_Service) {
		super();
		this.providedService_Service = providedService_Service;
	}

    // Implement controller methods
    
    
    
}