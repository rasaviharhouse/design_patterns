package creational.factory.factoryMethod.factory;

import creational.factory.factoryMethod.model.Vehicle;

// The main factory can be an abstract class/interface
public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();
}