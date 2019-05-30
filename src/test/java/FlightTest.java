import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Plane plane;


    @Before
    public void setUp(){
        passenger = new Passenger("Theo", 1);
        flight = new Flight("LDN476",
                            "BER",
                            "LDN",
                            "20:05");
    }

    @Test
    public void checkNumberOfSeatsAvailable(){
        flight.addPlane(PlaneType.BOEING747);
        assertEquals(175, flight.getPlaneCapacityFromEnum());
    }

    @Test
    public void bookPassengerOnFlightIfEnoughSpace(){
        flight.addPlane(PlaneType.BOEING747);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(3, flight.checkPassengerCount());
        assertEquals(172, flight.checkAvailableSeats());
    }


}
