package structural.The_Decorator_Design_Pattern.coffee_shop_scenario.coffee;

import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.Beverage;

public class DarkRoast extends Beverage {

    private DarkRoast() {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 500;
    }
}
