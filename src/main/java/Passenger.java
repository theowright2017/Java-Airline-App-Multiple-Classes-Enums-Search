import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public void assignFlight(Flight flight){
        this.flight = flight;
    }

    public String getFlight() {
        return this.flight.getFlightNumber();
    }

    public void assignSeatNumber(Flight flight){
        Random random = new Random();
        int randomNumber = random.nextInt(flight.returnSeatNumberArraySize() - 1);
        this.flight.getSeatArray().remove(randomNumber);
        this.seatNumber = randomNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
