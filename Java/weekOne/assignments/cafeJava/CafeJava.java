
public class CafeJava{
    public static void main(String[] args){

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displaTotalMessage = " Your total is $";

        double mochaPrice  = 3.5;
        double dripCoffee = 6.45;
        double almondLatte = 8.25;
        double doubleEspressoCappuccino = 1.47;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        System.out.println(generalGreeting + customer1 + "." + displaTotalMessage + (dripCoffee + almondLatte) + ".");
        System.out.println(customer1 + pendingMessage +".");
        
        System.out.println("====exTwo====");
        if (isReadyOrder4){
            System.out.println(customer4 + readyMessage + "." + displaTotalMessage + doubleEspressoCappuccino + ".");
        }
        else{
            System.out.println(customer4 + pendingMessage + ".");
        }
        
        System.out.println("====exThree====");
        System.out.println("Hey, " + customer2 + "." + displaTotalMessage +(almondLatte * 2) +".");
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage +".");
        }
        else{
            System.out.println(customer2 + pendingMessage +".");
        }

        System.out.println("====exFour====");
        System.out.println("Sorry, I ordered a latte and was charged $"+ dripCoffee + " for a coffee."+ " Sorry about that " + customer3 +". " + "We'll fix that for you." + displaTotalMessage + (almondLatte - dripCoffee)+".");

    }
}