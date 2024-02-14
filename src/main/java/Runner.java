import garage.air.Plane;
import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {
       //Land Vehicles
        IEngine combustionEngine = new CombustionEngine(99,"01/01/2024");
        Car hondaJazz = new Car(1300,150,"hatchback",combustionEngine);
        System.out.println(hondaJazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(399,100);
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());

        //Water Vehicles
        IEngine combustionEngine2 = new CombustionEngine(900,"01/01/2024");
        Speedboat fastWaterThing = new Speedboat(500,200,false, combustionEngine2);
        System.out.println(fastWaterThing.getHorsePower());

        IEngine electricEngine2 = new ElectricEngine(500,100);
        fastWaterThing.setEngine(electricEngine2);
        System.out.println(fastWaterThing.getHorsePower());

        //Air Vehicles
        IEngine combustionEngine3 = new CombustionEngine(150,"01/01/2024");
        Plane AirChina = new Plane(90000,300,true, combustionEngine3);
        System.out.println(AirChina.getHorsePower());

        IEngine electricEngine3 = new ElectricEngine(100,100);
       AirChina.setEngine(electricEngine3);
        System.out.println(AirChina.getHorsePower());

    }

}
