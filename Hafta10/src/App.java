public class App {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.Stock("Motorcycle", "V2 Engine");
        facade.Stock("Truck", "V8 Engine");
        facade.Stock("Bus", "V6 Engine");
        facade.Stock("Car", "V4 Engine");
    }
}