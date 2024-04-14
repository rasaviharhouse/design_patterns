package creational.factory.simpleFactory;

import creational.factory.simpleFactory.factory.VehicleFactory;
import creational.factory.simpleFactory.model.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.makeVehicle("Car");
        vehicle.print();
        vehicle.move();

        Vehicle vehicle2 = VehicleFactory.makeVehicle("Bike");
        vehicle2.print();
        vehicle2.move();
    }
}