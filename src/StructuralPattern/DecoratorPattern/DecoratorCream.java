package StructuralPattern.DecoratorPattern;

public class DecoratorCream extends CoffeeDecorator{
    Coffee coffee;
    DecoratorCream(Coffee coffee){
        this.coffee=coffee;
    }
    String discription(){
        return coffee.discription() + "with cream";
    }
    int cost(){
        return coffee.cost() + 30;
    }
}
