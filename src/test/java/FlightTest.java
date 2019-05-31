import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Plane plane;
    private SimpleDateFormat format;


    @Before
    public void setUp(){
        format = new SimpleDateFormat("HH:mm");
        Date flightTime = new Date();
        try {
             flightTime = format.parse("20:35");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        passenger = new Passenger("Theo", 1);
        flight = new Flight("LDN476",
                            "BER",
                            "LDN",
                                        flightTime);
    }

    @Test
    public void checkNumberOfSeatsAvailable(){
        flight.addPlane(PlaneType.BOEING747);
        System.out.println(flight.checkDepartureTime(flight));
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
