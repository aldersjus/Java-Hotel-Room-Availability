package booking.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookingSystemTest.class, FloorTest.class, HotelTest.class, RoomTest.class })
public class AllTests {

}
