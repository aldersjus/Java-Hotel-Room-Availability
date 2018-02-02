package booking.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import booking.BookingSystem;
import booking.Floor;
import booking.Hotel;
import booking.Room;

public class BookingSystemTest {

	static Hotel hotel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/////////////////////floors, rooms
		hotel = new Hotel(3, 4);
		
		//All rooms full floor one
		Room room = new Room("single", 1, true);
		Room room2 = new Room("twin", 2, true);
		Room room3 = new Room("single", 1, true);
		Room room4 = new Room("double", 1, true);
		Room[] rooms = new Room[4];
		rooms[0] = room;
		rooms[1] = room2;
		rooms[2] = room3;
		rooms[3] = room4;
		//Set some rooms full
		rooms[0].setEmpty(false);
		rooms[1].setEmpty(false);
		rooms[2].setEmpty(false);
		rooms[3].setEmpty(false);
		
		//Singles full floor 2
		Room room5 = new Room("single", 1, true);
		Room room6 = new Room("twin", 2, true);
		Room room7 = new Room("single", 1, true);
		Room room8 = new Room("double", 1, true);
		Room[] rooms2 = new Room[4];
		rooms2[0] = room5;
		rooms2[1] = room6;
		rooms2[2] = room7;
		rooms2[3] = room8;
		//Set some rooms full
		rooms2[0].setEmpty(false);
		rooms2[2].setEmpty(false);
		
		
		//Twin and double rooms full floor 3
		Room room9 = new Room("single", 1, true);
		Room room10 = new Room("twin", 2, true);
		Room room11 = new Room("single", 1, true);
		Room room12 = new Room("double", 1, true);
		Room[] rooms3 = new Room[4];
		rooms3[0] = room9;
		rooms3[1] = room10;
		rooms3[2] = room11;
		rooms3[3] = room12;
		//Set some rooms full
		rooms3[1].setEmpty(false);
		rooms3[3].setEmpty(false);
		
		//Add rooms to floor
		Floor floor1 = new Floor(1,4);
		floor1.addRooms(rooms);
		Floor floor2 = new Floor(2,4);
		floor2.addRooms(rooms2);
		Floor floor3 = new Floor(3,4);
		floor3.addRooms(rooms3);
		
		//Add floors to hotel
		hotel.setFloors(1, floor1);
		hotel.setFloors(2, floor2);
		hotel.setFloors(3, floor3);

	}

	@Test
	public void testSelectRoom_Positive() {
		BookingSystem sys = new BookingSystem(hotel);
		String returned = sys.selectRoomType("single");
		assertEquals("Available Room Number is: 9 Floor: 3",returned);
	}

	
	@Test
	public void testSelectRoom_Negative() {
		BookingSystem sys = new BookingSystem(hotel);
		String returned = sys.selectRoomType("zzzz");
		assertFalse(returned.equals("Available Room Number is: 6 Floor: 2"));
	}
	
	@Test
	public void testreserveRoom_Positive() {
		BookingSystem sys = new BookingSystem(hotel);
		String reserved = sys.reserveRoom(2, 6);
	assertTrue(reserved.equals("Room Reserved For Today"));
	}
	
	@Test
	public void testreserveRoom_Negative() {
		BookingSystem sys = new BookingSystem(hotel);
		String reserved = sys.reserveRoom(20, 60);
		assertTrue(reserved.equals("Unable To Reserve"));
	}

}












