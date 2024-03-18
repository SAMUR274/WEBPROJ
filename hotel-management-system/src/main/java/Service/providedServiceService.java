package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.providedService;
import Repository.providedServiceRepository;
import java.util.List;
import java.util.Optional;

@Service
public class providedServiceService {
    @Autowired
    private providedServiceRepository providedService_Repository;

    // Implement service methods
    // Method to save or update a provided service
    public providedService saveOrUpdateProvidedService(providedService service) {
        return providedService_Repository.save(service);
    }

    // Method to retrieve all provided services
    public List<providedService> getAllProvidedServices() {
        return providedService_Repository.findAll();
    }

    // Method to retrieve a provided service by its ID
    public Optional<providedService> getProvidedServiceById(Long id) {
        return providedService_Repository.findById(id);
    }

    // Method to delete a provided service by its ID
    public void deleteProvidedService(Long id) {
        providedService_Repository.deleteById(id);
    }
}