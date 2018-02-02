package booking;

/**
 * Represents the hotel.
 * @author Justin Alderson
 *
 */
public class Hotel {
	
	private Floor[] floors;
	private int roomsPerFloor;
	private int numberOfFloors;
	

	/**
	 * Create Hotel 
	 * @param numberOfFloors > 0
	 * @param roomsPerFloor > 0
	 */
	public Hotel(int numberOfFloors, int roomsPerFloor) {
		 floors  = new Floor[numberOfFloors];
		 this.roomsPerFloor = roomsPerFloor;
		 this.numberOfFloors = numberOfFloors;
	}

	/**
	 * Add floors to Hotel
	 * @param floor to allocate list position
	 * @param floorObj
	 */
	public void setFloors(int floor, Floor floorObj) {
		final  int LIST_POSITION_OFFSET = -1;
		this.floors[floor + LIST_POSITION_OFFSET] = floorObj; 
	}
	
	public Floor[] getFloors() {
		return floors;
	}

	
	public int getRoomsPerFloor() {
		return roomsPerFloor;
	}
	
	@Override
	public String toString() {
		return "Hotel with " + numberOfFloors + " floors.";
	}
}
