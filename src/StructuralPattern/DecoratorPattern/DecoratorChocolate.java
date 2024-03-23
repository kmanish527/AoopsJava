package StructuralPattern.DecoratorPattern;

public class DecoratorChocolate extends CoffeeDecorator{
    Coffee coffee;//made a member variable of super class coffee
    DecoratorChocolate(Coffee coffee){
        this.coffee=coffee;
    }
    String discription(){
        return coffee.discription() + "with chocolate";
    }
    int cost(){
        return coffee.cost() + 20 ;
    }
}
