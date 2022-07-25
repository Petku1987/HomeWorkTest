package homework.transport;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    public Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passengers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;
    }

    public void range() {
        System.out.println("Maximum distance with full fuelcap is " + fuelcap * mpg + " miles");
    }

    public int rangeInt() {
        int result;
        result = mpg * fuelcap;
        return result;
    }

    public double fuelNeeded(int distance) {
        return (double) distance / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }
}
