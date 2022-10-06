import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe{
    public static void main(String[] args){

        CafeUtil appTest = new CafeUtil();

        System.out.println("\n------ Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(13));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5, 8.1};
        System.out.printf("Order Total: %s \n\n", appTest.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        for(int i =0; i<4;i++){
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        System.out.println("----- Print Price Chart -----");
        appTest.printPriceChart("columbian coffee grounds", 2, 4);

        System.out.println("\n\n------Display menu with prices-------");
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(3.23);
        prices.add(6.17);
        prices.add(3.65);
        prices.add(5.43);
        appTest.displayMenu(menuItems,prices);


        //NOT WORKING
        // System.out.println("\n----- Add Customerss Test-----");
        // ArrayList<String> customers = new ArrayList<String>();
        // // --- Test 4 times ---
        //is_done
        // while(customers.get().charAt(0) != "q" ){
        //     appTest.addCustomers(customers);
        //     System.out.println("\n");
        // }
        // // for (int i = 0; i < 4; i++) {
        // // }
    }
}