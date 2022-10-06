public class Variables {
    public static void main(String[] args){
        
        String firstName = "Lazaro";

        firstName = "Tokui";
        // it prints this out; so its posibble to reassign as long as it is the same "type"

        double price1 = 3;
        double price2 = price1;
        boolean trueOrFalse = true;
        if (price1 <5) {
            trueOrFalse = false;
        }

        double total = 0;
        total = price1 + price2;
        System.out.println(total);
        System.out.println(firstName);
        System.out.println(trueOrFalse);
        
        String boolExamples = "=========";
        System.out.println(boolExamples + "bool examples:==========");
        boolean isSunny = false;
        if(isSunny){
            System.out.println("It's sunny!");
        }
        else{
            System.out.println("It's not sunny!");
        }

        boolean isRaining = true;
        boolean isCold = false;
        if(isRaining){
            System.out.println("Bring an umberalla");
            if(isCold){
                System.out.println("Wear a coat bro");
            }
            else{
                System.out.println("Its hot af!");
            }
        }
        System.out.println("===========switch statements:================");
        int day = 200;
        switch(day){
            case 1: 
                    System.out.println("monday");
                    break;
            case 2:
            System.out.println("tuesday");
            break;

            case 3:
            System.out.println("wednesday");
            break;

            case 4:
            System.out.println("thursday");
            break;

            case 5:
            System.out.println("friday");
            break;

            case 6:
            System.out.println("saturday");
            break;

            case 7:
            System.out.println("sunday");
            break;

            default:
            System.out.println("there are only seven days in a week...");
        }
        System.out.println("========ternery operators==========");
        System.out.println(isRaining ? "wear a raincoat" : "bring shades");\
        //                 condition        if true            if false
    }
}