import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
//                            Plane plane,
                            String flightNumber,
                            String destination,
                            String departureAirport,
                            String departureTime) {

        this.bookedPassengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addPlane(PlaneType plane) {
        PlaneType[] listOfPlanes = PlaneType.values();
        for (PlaneType eachPlane: listOfPlanes){
            if (plane == eachPlane){
                this.plane = new Plane(plane);
            }
        }
    }

    public int getPlaneCapacityFromEnum() {
        return this.plane.getCapacityFromEnum();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.plane.getAvailableSeatsRemaining() > 0 ){
            this.bookedPassengers.add(passenger);
            this.plane.removeOneFromAvailableSeats();
        }
    }

    public int checkPassengerCount() {
        return this.bookedPassengers.size();
    }

    public int checkAvailableSeats() {
        return this.plane.getAvailableSeatsRemaining();
    }

    public int checkBaggage(){
        return this.plane.checkBaggageAllowance();
    }
}
