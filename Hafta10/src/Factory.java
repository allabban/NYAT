public class Factory {
    public void VehicleCreate(String type, String model, String engine) {
        if (type.equalsIgnoreCase("Car")) {
            Car car = new Car(model, engine);
        } else if (type.equalsIgnoreCase("Bus")) {
            Bus bus = new Bus(model, engine);
        } else if (type.equalsIgnoreCase("Truck")) {
            Truck truck = new Truck(model, engine);
        } else {
            System.out.println("Invalid vehicle type");
        }
    
}
}
