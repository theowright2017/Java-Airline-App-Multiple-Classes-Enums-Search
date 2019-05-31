import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
        public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(175, plane.getCapacityFromEnum());
    }

    @Test
    public void getTotalWeight(){
        assertEquals(2500, plane.getTotalWeightFromEnum());
    }

    @Test
    public void canGetSeatNumbersAsArray(){
        plane.getSeatNumbers();
        assertEquals(true, plane.checkSeatArray());
    }

    @Test
    public void canGetSeatArraySize(){
        plane.getSeatNumbers();
        assertEquals(175, plane.getArrayOfSeatsSize());
    }
}
