package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Model.booking;

public interface bookingRepository extends JpaRepository<booking, Long> {
}