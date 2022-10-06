import java.util.ArrayList;
class JavaLoops{
    public static void main(String[] args){
        // //loop increased by 1
        // for(int i =0;i<5;i++){
        //     System.out.println(i);
        // }
        // //loop increasing by 2
        // for(int i = 0; i<5;i+=2){
        //     System.out.println(i);
        // }
        // //minus 1 each time
        // for(int i =5;i>0;i--){
        //     System.out.println(i);
        // }
        //while loops
        int count = 0;
        while(count<5){
            System.out.print(count);
            count++;
        }
        //enhanced for loop
        String[] fruits = {"banana", "orange", "apple", "kiwi"};
        for (String fruit : fruits){
            //this is basicly 
            //"for fruit in fruits"
            System.out.println(fruit);
            // "print fruit"
        }

        ArrayList<String> someArray = new ArrayList<String>();
        someArray.add("hello ");
        someArray.add("world");
        someArray.add("! This is Laz yo!");
        for (int i =0;i < someArray.size();i++){
            System.out.println(someArray.get(i));
        }

        for (int i=0;i<someArray.size();i++){
            String lazaro = someArray.get(i);
            System.out.println("Hello " + lazaro);
        }
        //another enhanced loop
        //for(element container : collection){
            // body statements
        // }
        for(String lazaro : someArray){
            System.out.println("hello" + lazaro);
        }
        //example of NOT being able to use enchanced loop
        ArrayList<String> snacks = new ArrayList<String> ();
        snacks.add("Apples");
        snacks.add("Pretzels");
        snacks.add("Almonds");
        snacks.add("Yogurt");
        System.out.println(snacks);
        // for(String snack : snacks ) {
        //     if(snack.charAt(0) == 'A') {
        //         snacks.remove(snack);
        //     }
        // this will encounter an error like
        // Exception in thread "main" java.util.ConcurrentModificationException
        
        //this is how it should be looped over
        for (int i = 0; i<snacks.size();i++){
            if(snacks.get(i).charAt(0) == 'A'){
                snacks.remove(i);
                }
            }
        System.out.println(snacks);

        }
    }
