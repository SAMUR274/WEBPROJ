package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.booking;
import Model.customer;
import Repository.customerRepository;
import java.util.List;
import java.util.Optional;


@Service
public class customerService {
    @Autowired
    private customerRepository customer_Repository;
  
    public customerService(customerRepository customer_Repository) {
		super();
		this.customer_Repository = customer_Repository;
	}

	public customer saveCustomer(customer customer) {
        // Save a customer entity to the database
        return customer_Repository.save(customer);
    }

    public List<customer> getAllCustomers() {
        // Retrieve all customers from the database
        return customer_Repository.findAll();
    }
    
    public Optional<customer> getCustomerById(Long id) {
        return customer_Repository.findById(id);
    }

    // Update operation
    public customer updateCustomer(customer customer) {
        return customer_Repository.save(customer);
    }

    // Delete operation
    public void deleteCustomer(Long id) {
    	customer_Repository.deleteById(id);
    }
    
    
    // Manage bookings
    public void addBookingToCustomer(Long customerId, booking booking) {
        Optional<customer> optionalCustomer = customer_Repository.findById(customerId);
        if (optionalCustomer.isPresent()) {
            customer customer = optionalCustomer.get();
            customer.getBookings().add(booking);
            booking.setCustomer(customer);
            customer_Repository.save(customer);
        } else {
            // Handle customer not found
        }
    } 
}
