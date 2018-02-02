package booking.test;

import static org.junit.Assert.*;

import org.junit.Test;

import booking.Floor;
import booking.Hotel;
import booking.Room;

public class HotelTest {

	
	@Test
	public void test() {
		Hotel hotel = new Hotel(3, 4);
		Room room = new Room("single", 1, true);
		Room room2 = new Room("twin", 2, true);
		Room room3 = new Room("single", 1, true);
		Room room4 = new Room("double", 1, true);
		Room[] rooms = new Room[4];
		rooms[0] = room;
		rooms[1] = room2;
		rooms[2] = room3;
		rooms[3] = room4;
		Floor floor1 = new Floor(1,4);
		floor1.addRooms(rooms);
		hotel.setFloors(1, floor1);
		
		assertTrue(hotel.getFloors().length == hotel.getRoomsPerFloor() - 1);
	}

}
