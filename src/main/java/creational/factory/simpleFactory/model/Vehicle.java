package creational.factory.simpleFactory.model;

// In the Simple Factory Pattern, the Product can be either an abstract class or an interface, but it should not be a concrete class directly.
public abstract class Vehicle {
    protected int wheels;

    protected String name;

    public abstract void move();

    public void print() {
        System.out.println(name + " has " + wheels + " wheels");
    }
}