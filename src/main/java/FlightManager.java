public class FlightManager {

    private Flight flight;
    private Plane plane;

    public FlightManager(Flight flight){
        this.flight = flight;
        this.plane = plane;
    }


    public int checkPersonalBaggageWeight(Flight flight) {
       return flight.checkBaggage();
    }

    public int checkTotalWeightBookedIn(Flight flight) {
        return flight.checkTotalWeightBooked();

    }

    public int checkHowMuchBaggageWeightRemaining(Flight flight) {
        return flight.checkTotalWeightRemaining();
    }


//    public int
}
