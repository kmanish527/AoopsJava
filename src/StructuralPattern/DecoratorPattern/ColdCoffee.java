package StructuralPattern.DecoratorPattern;

public class ColdCoffee extends Coffee{
    String discription(){
        return "Cold Coffee";
    }
    int cost(){
        return 60;
    }
}
