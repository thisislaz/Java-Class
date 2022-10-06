import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args){

        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 1.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 2.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 3.15;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 4.56;

        Order order1 = new Order();
        order1.name = "Cinduri";
        order1.isReady(true);

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.addItem(item1);
        order2.setTotal(item1.price);
        order2.addItem(item2);
        order2.setTotal(item2.price);
        order2.isReady(true);

        Order order3 = new Order();
        order3.name = "Noah";
        order3.addItem(item4);
        order3.setTotal(item4.price);

        Order order4 = new Order();
        order4.name = "Sam";
        order4.addItem(item2);
        order4.setTotal(item2.price);
        order4.addItem(item2);
        order4.addItem(item2);
        order4.setTotal(item2.price * 2);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        order2.orderSummary();
        System.out.println("********\n");
        order3.orderSummary();
        System.out.println("********\n");
        order4.orderSummary();
        System.out.println("********\n");
        order1.orderSummary();
    }
}