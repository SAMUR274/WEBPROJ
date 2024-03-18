package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import Model.booking;
import Model.customer;
import Service.customerService;
import java.util.List;


@Controller
@RequestMapping("/customers")
public class customerController {
    @Autowired
    private customerService customer_Service;
    
    public customerController(customerService customer_Service) {
		super();
		this.customer_Service = customer_Service;
	}
    
    

    // Implement controller methods
    
    
	@GetMapping("/")
    public List<customer> getAllCustomers() {
        return customer_Service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Optional<customer> getCustomerById(@PathVariable Long id) {
        return customer_Service.getCustomerById(id);
    }

    @PostMapping("/")
    public customer saveCustomer(@RequestBody customer customer) {
        return customer_Service.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public customer updateCustomer(@PathVariable Long id, @RequestBody customer customerDetails) {
        Optional<customer> optionalCustomer = customer_Service.getCustomerById(id);
        if (optionalCustomer.isPresent()) {
            customer customer = optionalCustomer.get();
            customer.setName(customerDetails.getName());
            customer.setPhoneNumber(customerDetails.getPhoneNumber());
            customer.setEmail(customerDetails.getEmail());

            return customer_Service.updateCustomer(customer);
        } else {
            // Handle customer not found
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
    	customer_Service.deleteCustomer(id);
    }
    
    @PostMapping("/{customerId}/bookings")
    public void addBookingToCustomer(@PathVariable Long customerId, @RequestBody booking booking) {
    	customer_Service.addBookingToCustomer(customerId, booking);
    }
    
}
