import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private ArrayList<Passenger> bookedPassengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(
//                            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            Date departureTime) {

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
            passenger.assignFlight(this);
//            System.out.println(passenger.getFlight());
        }
    }

//     public void assignFlightForPassenger(Passenger passenger){
//        passenger.assignFlight(this);
//    }

    public int checkPassengerCount() {
        return this.bookedPassengers.size();
    }

    public int checkAvailableSeats() {
        return this.plane.getAvailableSeatsRemaining();
    }

    public int checkBaggage(){
        return this.plane.checkBaggageAllowance();
    }


    public int checkTotalWeightBooked() {
        return this.bookedPassengers.size() * this.plane.checkBaggageAllowance();
    }

    public int checkTotalWeightRemaining() {
        int totalWeightBooked = this.bookedPassengers.size() * this.plane.checkBaggageAllowance();
        return this.plane.getReservedWeight() - totalWeightBooked;
    }

    public Date checkDepartureTime(Flight flight){
        return this.departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int returnSeatNumberArraySize(){
        return this.plane.getArrayOfSeatsSize();
    }

    public ArrayList<Integer> getSeatArray(){
        return this.plane.getArrayOfSeats();
    }









}
