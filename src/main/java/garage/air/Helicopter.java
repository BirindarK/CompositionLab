package garage.air;

import garage.Vehicle;
import garage.engine.IEngine;

public class Helicopter extends Vehicle implements IAirVehicle, IEngine {

    private int numberOfRotorBlades;
    private boolean hasRadar;
    private IEngine engine;

    public Helicopter(float weight, int maxSpeed, int numberOfRotorBlades, boolean hasRadar, IEngine engine) {
        super(weight, maxSpeed);
        this.numberOfRotorBlades = 6;
        this.hasRadar = hasRadar;
        this.engine = engine;
    }

    public int getHorsePower(){
        return this.engine.getHorsePower();
    }

    public void setHorsePower(int horsePower){
        this.engine.setHorsePower(horsePower);
    }

    public int getNumberOfRotorBlades() {
        return numberOfRotorBlades;
    }

    public void setNumberOfRotorBlades(int numberOfRotorBlades) {
        this.numberOfRotorBlades = numberOfRotorBlades;
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
