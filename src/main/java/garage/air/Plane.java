package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;

public class Plane extends Vehicle implements IAirVehicle, IEngine {

    private int numberOfWings;
    private boolean hasRadar;
    private IEngine engine;

    public Plane(float weight, int maxSpeed, boolean hasRadar, IEngine engine) {
        super(weight, maxSpeed);
        this.numberOfWings = 2;
        this.hasRadar = hasRadar;
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public boolean getHasRadar() {
        return hasRadar;
    }

    @Override
    public void setHasRadar(boolean hasRadar) {
        this.hasRadar = hasRadar;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
