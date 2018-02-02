package booking;

import java.util.Scanner;

/**
 * This application will check the room availability today.
 * @author Justin Alderson
 *
 */
public class Main {
	
	//Method simulates the today's availability
	public static Hotel simulateHotel() {
	
		/////////////////////floors, rooms
		Hotel hotel = new Hotel(3, 4);
		
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
		
		return hotel;
	}

	public static void main(String[] args) {
		
		Hotel hotel = simulateHotel();
		BookingSystem sys = new BookingSystem(hotel);
		Scanner sc = new Scanner(System.in);
		System.out.println("Check Availability");
		System.out.println("Room Types: Single, Double, Twin.");
		System.out.println("Please Enter The Room Type: ");
		String room = sc.nextLine().toLowerCase();
		String found = sys.selectRoomType(room);
		System.out.println(found);
		if(!found.equals("No Rooms Available")) {
			System.out.println("Would Yo Like To Reserve This Room?");
			System.out.println("Please Enter: Y or N");
			String reserve = sc.nextLine().toLowerCase();
			if(reserve.equals("y")) {
				System.out.println(sys.reserveRoom(sys.getSelectedFloor(), sys.getSelectedRoom()));
			}else {
				System.out.println("Action Completed");
			}
		}else {
			System.out.println("Action Completed");
		}
		sc.close();
		
	}

}
