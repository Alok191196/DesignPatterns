package behavioral.The_Command_Design_Pattern.chef_and_order_problem;

public class Client {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Order order = new Order(chef, "Pasta");
        Waiter waiter = new Waiter(order);
        waiter.execute();

        order = new Order(chef, "Cake");
        waiter = new Waiter(order);
        waiter.execute();
    }
}
