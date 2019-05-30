public class FlightManager {

    private Flight flight;
    private Plane plane;

    public FlightManager(){
        this.flight = flight;
        this.plane = plane;
    }


    public int checkPersonalBaggageWeight(Flight flight) {
       return this.flight.checkBaggage();
    }
}
