package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.room;
import Repository.roomRepository;
import java.util.List;

@Service
public class roomService {
    @Autowired
    private roomRepository room_Repository;

    // Implement service methods
}