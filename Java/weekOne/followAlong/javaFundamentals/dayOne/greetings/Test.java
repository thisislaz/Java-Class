// file name must be the same as the class name
// every file is a class

public class Test{
    // the file or class with the exact method signature below
    // is always the launching poiont of the application
    // you cannot run a java program without it
    public static void main(String[] args){
        // for now, all your code goes here
        System.out.println("Hello World!");
        String firstName = "Bobby";
        String lastName = " Brown";
        System.out.println(firstName + " " + lastName);
        Integer age = 54;
        boolean isBald = true;
        double weight = 175.23;
        char grade = 'F';
        System.out.println("Name: " + firstName + " " + "\n" +
                            "age: " + age+ "\n"+
                            "weight: " + weight+ "\n"+
                            "grade: " + grade + " | is bald: " + isBald);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        if(weight < 100){
            System.out.println("you need to gain some weight");
        }else{
            System.out.println("your fine");
        }

        System.out.println(weight < 100 ? "you need to gain weight" : "you're fine yo");

        String fullName = firstName.concat(lastName);
        System.out.println("Full Name Length is: " + fullName.length());
        System.out.println("Full name is: " + fullName);

        String greetingUs = String.format("Hi %s, you are %d yeards old", fullName, age);
        System.out.println(greetingUs);
        // System.out.printf("Hi %s, you are %d years old!!", fullName, age);

        String firstName1 = "martha";
        String firstName2 = new String("martha");
        String firstName3 = "martha";
        System.out.println(firstName1.equals(firstName2));
        System.out.println(firstName1 == firstName3);

   }
}

// class and compliled file name must match or it wont run

// whenever you run a file, you gotta compile
