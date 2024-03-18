package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import Model.room;
import Service.roomService;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/rooms")
public class roomController {
    @Autowired
    private roomService room_Service;

	public roomController(roomService room_Service) {
		super();
		this.room_Service = room_Service;
	}
    
    

    // Implement controller methods
	
	@GetMapping("/")
    public List<room> getAllRooms() {
        return room_Service.getAllRooms();
    }

    @GetMapping("/{id}")
    public Optional<room> getRoomById(@PathVariable Long id) {
        return room_Service.getRoomById(id);
    }

    @PostMapping("/")
    public room saveRoom(@RequestBody room room) {
        return room_Service.saveOrUpdateRoom(room);
    }

    @PutMapping("/{id}")
    public room updateRoom(@PathVariable Long id, @RequestBody room roomDetails) {
        Optional<room> optionalRoom = room_Service.getRoomById(id);
        if (optionalRoom.isPresent()) {
            room room = optionalRoom.get();
            // Update room details
            room.setRoomNumber(roomDetails.getRoomNumber());
            room.setType(roomDetails.getType());
            room.setPrice(roomDetails.getPrice());

            // Save the updated room
            return room_Service.saveOrUpdateRoom(room);
        } else {
            // Handle room not found
            return null;
        }    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Long id) {
    	room_Service.deleteRoom(id);
    }
}