package CreationalPattern.factorypattern;

abstract class BillPlanAbstact {//abstract class can have both abstract methods and normal methods
    double rates;//by default it is protected i.e can be used in the package
    abstract void getRate();
    void getBills(double untis){
        System.out.println("Your bill = "+(rates*untis));
    }
}
