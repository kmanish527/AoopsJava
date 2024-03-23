package CreationalPattern.factorypattern;
//define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate
//also known as Virtual Constructor
//It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
// That means the code interacts solely with* the resultant interface or abstract class,
// so that it will work with any classes that implement that interface or that extends that abstract class.

public class BillFactory {//bill factory to create objects based on the recuirement of generate bill class
    BillPlanAbstact getPlanObject(String planType){
        if(planType==null){
            return null;
        }
        else if(planType.equalsIgnoreCase("DP")){
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("CP")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("IP")){
            return new IndustrialPlan();
        }
        return null;
    }
}
