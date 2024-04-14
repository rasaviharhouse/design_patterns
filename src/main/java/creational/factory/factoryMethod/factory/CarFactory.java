package creational.factory.factoryMethod.factory;

import creational.factory.factoryMethod.model.Car;
import creational.factory.factoryMethod.model.Vehicle;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
