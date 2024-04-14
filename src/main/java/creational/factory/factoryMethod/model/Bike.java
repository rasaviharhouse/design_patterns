package creational.factory.factoryMethod.model;

public class Bike extends Vehicle {
    public Bike() {
        wheels = 2;
        name = "Bike";
    }

    @Override
    public void move() {
        System.out.println("Bike is Moving");
    }

}
