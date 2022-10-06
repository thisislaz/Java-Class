public class StringPrac {
    public static void main(String[] args){
        // length in java
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println("String Length is: " + length);

        String string1 = "My name is ";
        String string2 = "Lazaro";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        System.out.println(string1 + string2);
        // they both work
        
        // formating method
        String ninja1 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja1);

        //indexof method searches left to right insde the given string for a target string and returns the index alue of the location or -1 if its undefined
        // String ninja2 = "Welcome to Coding Dojo!";
        // int a = ninja.indexof("Coding");
        // int b = ninja.indexof("co");
        // int c = ninja.indexof("pizza");

        // trim() removes any trailing or leading spaces
        String sentence = "      spaces everywhere!         ";
        System.out.println(sentence.trim());

        // uppercase and lowercase
        String a = "HELLO";
        String b = "world";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        // equality can compare the equality of a string in two ways. they refer to the exact  same object or they have the same exact sequence of characters.
        String ab = "same string";
        String ba = "same string";
        System.out.println(ab == ba);

        ab = new String("same letters");
        ba = new String("same letters");
        System.out.println(ab == ba); //false becuase its not the same object in memory
        System.out.println(ab.equals(ba));//true, same exact characters

        // sometimes "==" is not useful and u need to use ".equals()"
        String abc = new String("dojo");
        System.out.println(abc == "dojo");// prints false

        String abcd = new String("Dojo");
        System.out.println(abcd.equals("Dojo"));


    }
}