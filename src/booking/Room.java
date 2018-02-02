package booking;

/**
 * A class to represent rooms in the hotel.
 * @author Justin Alderson
 */
public class Room {

	private String type;
	private int numOfBeds;
	private boolean hasView;
	private boolean empty = true;
	private int roomNumber;
	public static int roomNumbersCreated = 1;
	
	/**
	 * Create Room
	 * @param type room type != null
	 * @param beds > 0
	 * @param view boolean has a view
	 */
	public Room(String type, int beds, boolean view) {
		this.type = type;
		this.numOfBeds = beds;
		this.hasView = view;
		this.roomNumber = roomNumbersCreated;
		roomNumbersCreated++;
	}
	public String getType() {
		return type;
	}
	
	public int getNumOfBeds() {
		return numOfBeds;
	}
	
	public boolean hasView() {
		return hasView;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	@Override
	public String toString() {
		return type + " room";
		
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	
	
}
