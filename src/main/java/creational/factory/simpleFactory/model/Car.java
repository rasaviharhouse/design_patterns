package creational.factory.simpleFactory.model;

public class Car extends Vehicle {
    public Car() {
        wheels = 4;
        name = "Car";
    }

    @Override
    public void move() {
        System.out.println("Car is Moving");
    }
}