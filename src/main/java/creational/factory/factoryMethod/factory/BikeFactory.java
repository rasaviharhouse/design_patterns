package creational.factory.factoryMethod.factory;

import creational.factory.factoryMethod.model.Bike;
import creational.factory.factoryMethod.model.Vehicle;

public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
