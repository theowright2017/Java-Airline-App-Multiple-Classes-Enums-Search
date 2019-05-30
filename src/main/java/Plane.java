public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
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
        return this.plane.getTotalWeightKg() / this.plane.getCapacity();
    }


}
