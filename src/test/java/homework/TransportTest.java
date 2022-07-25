package homework;

import homework.transport.Offroad;
import homework.transport.Truck;
import homework.transport.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransportTest {

    Vehicle v = new Vehicle(5, 40, 10);
    Offroad or = new Offroad(7,60, 20, 10);
    Truck t = new Truck(10, 80, 25,15);

    @Test
    public void RangeCalculation() {
        int total = 40 * 10;
        assertEquals("Can we calculate range", total, v.getFuelcap() * v.getMpg());
    }

    @Test
    public void RangeIntReturn() {
        int total = 10 * 40;
        assertEquals("Can we return rangeInt", total, v.rangeInt());
    }

    @Test
    public void FuelNeededCalculation() {
        double distance = 300;
        double total = distance / 10;
        assertEquals("Can we calculate fuel needed", total, v.fuelNeeded(300), 0.0);
    }

    @Test
    public void GetPassengers() {
        assertEquals("Can we get number of passengers", 5, v.getPassengers());
    }

    @Test
    public void SetPassengers() {
        v.setPassengers(20);
        assertEquals("Can we set number of passengers", 20, v.getPassengers());
    }

    @Test
    public void GetFuelCap() {
        assertEquals("Can we get fuel cap volume", 10, v.getMpg());
    }

    @Test
    public void SetFuelCap() {
        v.setFuelcap(45);
        assertEquals("Can we set fuel cap volume", 45, v.getFuelcap());
    }

    @Test
    public void GetMpg() {
        assertEquals("Can we get number of miles per gallon", 10, v.getMpg());
    }

    @Test
    public void SetMpg() {
        v.setMpg(20);
        assertEquals("Can we set number of miles per gallon", 20, v.getMpg());
    }

    @Test
    public void GetGroundClearance() {
        assertEquals("Can we get number of ground clearance", 10, or.getGroundClearance());
    }

    @Test
    public void SetGroundClearance() {
        or.setGroundClearance(25);
        assertEquals("Can we set number of ground clearance", 25, or.getGroundClearance());
    }

    @Test
    public void GetCargocap() {
        assertEquals("Can we get number of cargocap", 15, t.getCargocap());
    }

    @Test
    public void PutCargocap() {
        t.putCargo(10);
        assertEquals("Can we set number of cargocap", 10, t.getCargocap());
    }
}