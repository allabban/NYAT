public class Facade {
    public void Stock(String model, String engine) {// we can use enum instead of string
        if(model.equalsIgnoreCase("Motorcycle")) {//it's better to use switch case instead of if / else if
            Motorcycle motorcycle = new Motorcycle(model, engine);
        }
        else if(model.equalsIgnoreCase("Truck")) {
            Truck truck = new Truck(model, engine);
        }
        else if(model.equalsIgnoreCase("Bus")) {
            Bus bus = new Bus(model, engine);
        }
        else {
            System.out.println("Invalid model type.");
        }
    }
}
