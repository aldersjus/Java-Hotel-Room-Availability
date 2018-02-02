package booking;

/**
 * Class to check today's room availability and book for today.
 * @author Justin Alderson
 *
 */
public class BookingSystem {
	
	private Hotel hotel;
	private int selectedFloor;
	private int selectedRoom;
	
	public BookingSystem(Hotel hotel) {
		this.hotel = hotel;
	}

	/**
	 * @param floor > 0
	 * @param room > 0
	 * @return String
	 */
	public String reserveRoom(int floor, int room) {
		for(Floor f : hotel.getFloors() ) {
			if(floor == f.getFloor()) {
				for(Room r : f.getRooms()) {
					if(room == r.getRoomNumber()) {
						r.setEmpty(false);
						return "Room Reserved For Today";
					}
				}
			}
		}
		return "Unable To Reserve";
		
	}
	
	/**
	 * Switch on String room
	 * @param room != null
	 * @return
	 */
	public String selectRoomType(String room) {
		String found = null;
		switch(room) {
		case "twin":
			found = searchForRoom("twin");
			break;
		case "single":
			found = searchForRoom("single");
			break;
		case "double":
			found = searchForRoom("double");
			break;
		default:
			found = "No Rooms Of That Type";
			break;
		}
		
		return found;
	}
	
	/**
	 * Find the available rooms
	 * @param roomType != null
	 * @return
	 */
	private String searchForRoom(String roomType) {
		int roomNumber = 0;
		int floorNumber = 0;
		for(Floor f : hotel.getFloors() ) {
			floorNumber = f.getFloor();
			for(Room r : f.getRooms()) {
				if(r.getType().equals(roomType) & r.isEmpty() == true) {
					roomNumber = r.getRoomNumber();
					selectedFloor = floorNumber;
					selectedRoom = roomNumber;
					return "Available Room Number is: " + roomNumber + " Floor: " + floorNumber;
				}
			}
		}
		return "No Rooms Available";
	}

	public int getSelectedFloor() {
		return selectedFloor;
	}

	public int getSelectedRoom() {
		return selectedRoom;
	}
	
	@Override
	public String toString() {
		return "Hotel Booking System";
	}
}
