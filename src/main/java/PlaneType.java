public enum PlaneType {

    BOEING747(175, 2500, 175),
    JUMBO757(250, 4600, 250);

    private final int capacity;
    private int totalWeightKg;
    private int availableSeats;

    PlaneType(int capacity, int totalWeightKg, int availableSeats) {
        this.capacity = capacity;
        this.totalWeightKg = totalWeightKg;
        this.availableSeats = availableSeats;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void reduceAvailableSeatsByOne(){
        this.availableSeats -= 1;
    }

    public int getTotalWeightKg() {
        return totalWeightKg;
    }
}
