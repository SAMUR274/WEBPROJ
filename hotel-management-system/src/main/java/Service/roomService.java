package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Model.room;
import Repository.roomRepository;
import java.util.List;
import java.util.Optional;


@Service
public class roomService {
    @Autowired
    private roomRepository room_Repository;

    public roomService(roomRepository room_Repository) {
		super();
		this.room_Repository = room_Repository;
	}

	// Implement service methods
    // Method to save or update a room
    public room saveOrUpdateRoom(room room) {
        return room_Repository.save(room);
    }

    // Method to retrieve all rooms
    public List<room> getAllRooms() {
        return room_Repository.findAll();
    }

    // Method to retrieve a room by its ID
    public Optional<room> getRoomById(Long id) {
        return room_Repository.findById(id);
    }

    // Method to delete a room by its ID
    public void deleteRoom(Long id) {
        room_Repository.deleteById(id);
    }
}