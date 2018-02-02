package booking;

/**
 * Represents a floor in the hotel.
 * @author Justin Alderson
 *
 */
public class Floor {
	
	private int floor;
	private int numOfRooms;
	private Room[] rooms = new Room[numOfRooms];
	
	/**
	 * Create a Floor object
	 * @param floor > 0
	 * @param numOfRooms > 0
	 */
	public Floor(int floor,int numOfRooms) {
		this.floor = floor;
		this.numOfRooms = numOfRooms;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public Room[] getRooms() {
		return rooms;
	}
	
	/**
	 * Add rooms to floor
	 * @param validate == rooms.length
	 * @param rooms
	 * @return
	 */
	public boolean addRooms(Room[] rooms) {
		if(numOfRooms == rooms.length) {
			this.rooms = rooms;
			return true;
		}
		return false;
	}

	public int getFloor() {
		return floor;
	}
	
	@Override
	public String toString() {
		return "Floor with " + numOfRooms + " rooms.";
	}
	
}
