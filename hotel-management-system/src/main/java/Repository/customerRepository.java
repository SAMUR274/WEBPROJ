package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Model.customer;

public interface customerRepository extends JpaRepository<customer, Long> {
}