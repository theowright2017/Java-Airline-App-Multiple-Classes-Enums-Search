import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private ArrayList<Integer> arrayOfSeats;

    public Plane(PlaneType plane){
        this.plane = plane;
        this.arrayOfSeats = new ArrayList<Integer>();
    }

    public PlaneType getPlane(){
        return this.plane;
    }

    public int getCapacityFromEnum() {
        return this.plane.getCapacity();
    }

    public int getTotalWeightFromEnum(){
        return this.plane.getTotalWeightKg();
    }

    public int getAvailableSeatsRemaining() {
        return this.plane.getAvailableSeats();
    }

    public void removeOneFromAvailableSeats(){
        this.plane.reduceAvailableSeatsByOne();
    }

    public int checkBaggageAllowance(){
//        int reservedWeight = this.plane.getTotalWeightKg() / 2;
        return getReservedWeight() / this.plane.getCapacity();
    }

    public int getReservedWeight(){
        return this.plane.getTotalWeightKg() / 2;
    }

    public void getSeatNumbers(){
        int seats = 0;
        boolean result = false;
        while (seats < this.plane.getCapacity()){
            seats++;
            this.arrayOfSeats.add(seats);
        }
    }

    public boolean checkSeatArray(){
        boolean result = false;
        if (this.arrayOfSeats.size() == this.plane.getCapacity()){
            result = true;
        }
        return result;
    }

    public int getArrayOfSeatsSize() {
        return this.arrayOfSeats.size();
    }

    public ArrayList<Integer> getArrayOfSeats() {
        return arrayOfSeats;
    }


}
