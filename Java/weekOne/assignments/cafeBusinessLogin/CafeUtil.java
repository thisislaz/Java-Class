import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil{
    
    int getStreakGoal(int numWeeks){
        int week = 0;
        for(int i =0; i<=numWeeks;i++){
            week = i + week;
        }
        return week;
    }

    double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(int i =0;i<lineItems.length;i++){
            sum += lineItems[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0;i<menuItems.size();i++){
            System.out.println(menuItems.get(i));
        }
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    void printPriceChart(String product, double price, int maxQuantity){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.00");
        System.out.print(product);
        for( int i=1;i<=maxQuantity;i++){
            double discount = 0;
            if(i>1){
                discount = (i-1)*0.5;
            }
            System.out.printf("\n%s- " + myFormatter.format(price*i - discount) , i);
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i = 0; i<menuItems.size();i++){
            System.out.println(i+ ": " + menuItems.get(i) + " -- $" + prices.get(i));
        }
        return true;
    }

/* DOES NOT WORK!!!

    // void addCustomers(ArrayList<String> customers){
    //     System.out.println("Customer Names: ");
    //     String customerNames = System.console().readLine();
    //     System.out.println(customerNames);
    //     System.out.println(customers);
    //     customers.add(customerNames);
        
    // }
*/

}