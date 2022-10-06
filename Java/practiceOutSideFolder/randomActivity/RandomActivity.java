import java.util.Random;

public class RandomActivity{

    public static void main(String[] args){

        Random dice = new Random();

        int newRoll = dice.nextInt();
        System.out.println("This: " + newRoll);

        //0 to 21
        int newRollOne = dice.nextInt(21);
        System.out.println("This: " + newRollOne);

        //5 to 35
        int newRollTwo = dice.nextInt(36-5)+5;
        System.out.println("This: " + newRollTwo);


        //1000 - 9999
        int newRollThree = dice.nextInt(10000-1000) +1000;
        System.out.println("This: " + newRollTwo);

        //function call
        int newRollFour = diceRange(1,7);
        System.out.println("This: " + newRollFour);

        int overloadedFunctionCall = diceRange(10);
        System.out.println(overloadedFunctionCall);
    }

    public static int diceRange(int start, int finish){
        Random dice = new Random();
        int randomRoll = dice.nextInt(finish + 1 - start) + start;
        return randomRoll;
    }

    /* it can also be written as:
    
    return new Random().nextInt(finish + 1 - start) + start;
    
    */

    public static int diceRange(int finish){
        return diceRange(1, finish);
        //this way u use the first one to always start at 1;
    }
}