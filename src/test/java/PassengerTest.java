import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private SimpleDateFormat format;

    @Before
    public void setUp(){
    format = new SimpleDateFormat("HH:mm");
    Date flightTime = new Date();
        try {
        flightTime = format.parse("20:35");
    } catch (
    ParseException e) {
        e.printStackTrace();
    }
    passenger = new Passenger("Jane", 1);
    flight = new Flight("HAN746",
                                "HAN",
                                "DBN",
                                  flightTime);
}


    @Test
    public void checkCanAddFlightToPassengerWhenBooked(){
        flight.addPlane(PlaneType.JUMBO757);
        flight.bookPassenger(passenger);
        assertEquals("HAN746", passenger.getFlight());
    }

//    @Test
//    public void checkSeatNumberAssigned(){
//        flight.returnSeatArrayList();
//        passenger.assignSeatNumber(flight);
//        assertEquals(1, passenger.getSeatNumber());
//    }
    //have so far decided to create random number between the plane capacity, and i will then use that as the index from which to
    //assign the seat number to the customer.  I have struggled to get the array created for this method, and is usually coming back
    //null, this is because within the same method, i need to create the array list of seat numbers, and return it

}
