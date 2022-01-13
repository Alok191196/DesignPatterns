package structural.The_Decorator_Design_Pattern.coffee_shop_scenario.add_on;

import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.AddOn;
import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.Beverage;

public class Sugar extends AddOn {

    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50;
    }
}
