import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Flight flight;

    @Before
    public void setUp(){
        flightManager = new FlightManager();
        flight = new Flight("LDN476",
                            "BER",
                            "LDN",
                             "20:05");
    }

    @Test
     public void checkAllowedBaggageWeight() {
        flight.addPlane(PlaneType.BOEING747);
        assertEquals(14, flightManager.checkPersonalBaggageWeight(flight));
    }
}
