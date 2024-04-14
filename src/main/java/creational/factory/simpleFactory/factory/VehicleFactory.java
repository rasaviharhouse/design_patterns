package creational.factory.simpleFactory.factory;

import creational.factory.simpleFactory.model.Bike;
import creational.factory.simpleFactory.model.Vehicle;
import creational.factory.simpleFactory.model.Car;

// VehicleFactory produces Vehicle objects
public class VehicleFactory {
    // This method doesn't have to be static, but it's a good design choice, since this factory class doesn't have any attribute
    public static Vehicle makeVehicle(String type) {
        if (type.equals("Car")) {
            return new Car();
        } else if (type.equals("Bike")) {
            return new Bike();
        }
        // Handle other product types or throw an exception
        return null;
    }
}