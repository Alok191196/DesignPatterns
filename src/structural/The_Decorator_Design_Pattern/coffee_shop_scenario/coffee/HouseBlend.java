package structural.The_Decorator_Design_Pattern.coffee_shop_scenario.coffee;

import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.Beverage;

public class HouseBlend extends Beverage {

    public  HouseBlend() {
        super("House Blend");
    }

    @Override
    public double cost() {
        return 250;
    }
}
