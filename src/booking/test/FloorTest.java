package booking.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import booking.Floor;
import booking.Room;

public class FloorTest {
	
	static Floor floor1;
	static Room[] rooms;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Room room = new Room("single", 1, true);
		Room room2 = new Room("twin", 2, true);
		Room room3 = new Room("single", 1, true);
		Room room4 = new Room("double", 1, true);
		rooms = new Room[4];
		rooms[0] = room;
		rooms[1] = room2;
		rooms[2] = room3;
		rooms[3] = room4;
		floor1 = new Floor(1,4);
		floor1.addRooms(rooms);
	}

	@Test
	public void testNumRooms() {
		assertTrue(floor1.getNumOfRooms() == 4);
	}

	@Test
	public void testAdded() {
		assertTrue(floor1.addRooms(rooms));
	}
	
	@Test
	public void testFloorNum() {
		assertTrue(floor1.getFloor() == 1);
	}
}
