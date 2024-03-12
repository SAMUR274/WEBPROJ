package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.providedService;
import Repository.providedServiceRepository;
import java.util.List;

@Service
public class providedServiceService {
    @Autowired
    private providedServiceRepository providedService_Repository;

    // Implement service methods
}