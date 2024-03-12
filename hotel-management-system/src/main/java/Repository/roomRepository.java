package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Model.room;

public interface roomRepository extends JpaRepository<room, Long> {
}