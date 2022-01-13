package structural.The_Decorator_Design_Pattern.coffee_shop_scenario;

import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.add_on.Milk;
import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.add_on.Sugar;
import structural.The_Decorator_Design_Pattern.coffee_shop_scenario.coffee.HouseBlend;

public class CoffeeShop {

    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + ": " + houseBlend.cost());

        Milk milkAddOn = new Milk(houseBlend);
        System.out.println(milkAddOn.getDescription() + " :" + milkAddOn.cost());

        Sugar sugarAddOn = new Sugar(milkAddOn);
        System.out.println(sugarAddOn.getDescription() + " :" + sugarAddOn.cost());

    }
}
