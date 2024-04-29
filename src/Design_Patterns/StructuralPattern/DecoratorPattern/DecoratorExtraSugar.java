package Design_Patterns.StructuralPattern.DecoratorPattern;

public class DecoratorExtraSugar extends CoffeeDecorator{
    Coffee coffee;
    DecoratorExtraSugar(Coffee coffee){// constructor
        this.coffee=coffee;
    }
    String discription(){
        return coffee.discription() + "With extra sugar";
    }
    int cost(){
        return coffee.cost() + 10;
    }
}
