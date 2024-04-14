package creational.factory.factoryMethod;

import creational.factory.factoryMethod.factory.BikeFactory;
import creational.factory.factoryMethod.factory.CarFactory;
import creational.factory.factoryMethod.factory.VehicleFactory;
import creational.factory.factoryMethod.model.Vehicle;

public class Client {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.print();
        car.move();

        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.print();
        bike.move();
    }
}