package homework.transport;

public class Offroad extends Vehicle{
    private int groundClearance;

    public Offroad(int numberOfPassengers, int fuelCapVolume, int milesPerGallon, int groundClearance) {
        super(numberOfPassengers, fuelCapVolume, milesPerGallon);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }
}


