package StructuralPattern.BridgePattern;

public class Car extends Vehicle{
    Workshop workshop1,workshop2;
    Car(Workshop workshop1,Workshop workshop2){
        this.workshop1=workshop1;
        this.workshop2=workshop2;
    }
    @Override
    void name() {
        System.out.print("Car");
        workshop1.manufacture();
        workshop2.manufacture();
    }
}
