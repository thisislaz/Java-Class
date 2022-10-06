import java.util.Date;
public class VoiceMessageUtil{

    public String greeting(String name){
        return "Hello, " + name;
    }

    public String greeting(String firstName, String lastName){
        return "Hello, " + firstName + " " + lastName;
    }

    public String greeting(int age){
        return "Hello, your age is: " + age;
    }

    public String getTodaysDate(){
        Date today = new Date();
        System.out.println("hello it is: " + today);
    }
}