abstract class Vehicle {
    protected String model;
    protected String engine;

    public Vehicle(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }
    public abstract void produce();
}
class Bus extends Vehicle {
    public Bus(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void produce() {
        System.out.println("Producing a Bus: Model - " + model + ", Engine - " + engine);
    }
}
class Truck extends Vehicle {
    public Truck(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void produce() {
        System.out.println("Producing a Truck: Model - " + model + ", Engine - " + engine);
    }
}
class Car extends Vehicle {
    public Car(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void produce() {
        System.out.println("Producing a Car: Model - " + model + ", Engine - " + engine);
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String model, String engine) {
        super(model, engine);
    }

    @Override
    public void produce() {
        System.out.println("Producing a Motorcycle: Model - " + model + ", Engine - " + engine);
    }
}