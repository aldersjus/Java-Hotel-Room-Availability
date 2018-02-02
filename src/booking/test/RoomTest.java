package booking.test;

import static org.junit.Assert.*;

import org.junit.Test;

import booking.Room;

public class RoomTest {

	@Test
	public void testType() {
		Room room = new Room("single", 1, true);
		assertTrue(room.getType().equals("single"));
	}
	
	@Test
	public void testNumBeds() {
		Room room2 = new Room("twin", 2, true);
		assertTrue(room2.getNumOfBeds() == 2);
	}

	@Test
	public void testRoomNum() {
		Room room = new Room("single", 1, true);
		Room room2 = new Room("twin", 2, true);
		assertTrue(room.getRoomNumber() != room2.getRoomNumber());
	}
}
