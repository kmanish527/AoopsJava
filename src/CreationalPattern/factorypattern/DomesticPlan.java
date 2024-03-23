package CreationalPattern.factorypattern;

public class DomesticPlan extends BillPlanAbstact{//whenever a class extends an abstract class it needs to define all the abstract methods
    void getRate(){
        rates=2.78;//per unit rate
    }
}
