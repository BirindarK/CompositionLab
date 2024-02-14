package garage.water;

import garage.Vehicle;
import garage.land.ILandVehicle;

public class Pedalboat extends Vehicle implements IWaterVehicle {


    private int numberOfSeats;
    private String hullType;

    public Pedalboat(float weight, int maxSpeed, int numberOfSeats){
        super(weight, maxSpeed);
        this.numberOfSeats = numberOfSeats;
        this.hullType = "Plastic";
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getHullType() {
        return hullType;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
