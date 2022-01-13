package structural.The_Decorator_Design_Pattern.coffee_shop_scenario.add_on;

import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.AddOn;
import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.Beverage;

public class Milk extends AddOn {

    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 100;
    }
}
