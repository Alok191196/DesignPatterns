package structural.The_Decorator_Design_Pattern.coffee_shop_scenario;

public abstract class AddOn extends Beverage {

    protected Beverage beverage;

    public AddOn(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
