package Design_Patterns.StructuralPattern.BridgePattern;

public class Main {
    public static void main(String[] args) {
        //for car
        Car c = new Car(new Produce(),new Assemble());
        c.name();
        //for bike
        Bike b = new Bike(new Produce(),new Assemble());
        b.name();
    }
}
