package structural.The_Decorator_Design_Pattern.coffee_shop_scenario;

public abstract class Beverage {

    private final String description;

    public Beverage(String description) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
