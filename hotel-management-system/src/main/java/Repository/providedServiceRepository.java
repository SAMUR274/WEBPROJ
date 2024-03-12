package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Model.providedService;

public interface providedServiceRepository extends JpaRepository<providedService, Long> {
}