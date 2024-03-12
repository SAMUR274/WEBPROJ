package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.customer;
import Repository.customerRepository;
import java.util.List;

@Service
public class customerService {
    @Autowired
    private customerRepository customer_Repository;

    // Implement service methods
}