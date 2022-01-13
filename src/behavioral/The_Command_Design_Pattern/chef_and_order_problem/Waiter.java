package behavioral.The_Command_Design_Pattern.chef_and_order_problem;

public class Waiter {
    private Order order;

    public Waiter(Order ord) {
        this.order = ord;
    }

    public void execute() {
        this.order.execute();
    }
}
