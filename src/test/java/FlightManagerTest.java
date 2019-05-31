import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
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
        flightManager = new FlightManager(flight);
        passenger1 = new Passenger("Tom", 2);
        passenger2 = new Passenger("Elliot", 1);
        passenger3 = new Passenger("James", 1);
        flight = new Flight("LDN476",
                            "BER",
                            "LDN",
                             flightTime);
    }

    @Test
     public void checkAllowedBaggageWeight() {
        flight.addPlane(PlaneType.BOEING747);
        assertEquals(7, flightManager.checkPersonalBaggageWeight(flight));
    }

    @Test
    public void checkTotalCheckedInBaggageWeight(){
        flight.addPlane(PlaneType.BOEING747);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(21,flightManager.checkTotalWeightBookedIn(flight));
    }

    @Test
    public void checkHowMuchBaggageWeightRemaining(){
        flight.addPlane(PlaneType.BOEING747);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger3);
        assertEquals(1229, flightManager.checkHowMuchBaggageWeightRemaining(flight));
    }
}
