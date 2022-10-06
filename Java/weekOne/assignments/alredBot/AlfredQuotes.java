import java.util.Date;
import java.text.DateFormat;
public class AlfredQuotes{
    public String basicGreeting(){
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(){
        String dateToString  = DateFormat.getInstance().format(new Date());
        return String.format("The date is " + dateToString);
    }

    public String guestGreeting(String name){
        return String.format("Good %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod){
        // String guest = String.format("%s",name);
        // return "Hello " + guest+ ", lovely to see you.";
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement(){
        // Date showDate = new Date();
        // return "The date is " + showDate;
        return String.format("The date is %s", new Date());
    }

    public String respondBeforeAlexis(String conversation){
        String snarkyResponse = "Right away, sir. She certainly isn't sophisticated enough for that.";
        if (conversation.indexOf("Alexis!")>-1){
            return snarkyResponse;
        }
        if(conversation.indexOf("Alfred") > -1){
            return "At your serivce, naturally. how may i be of assistance?";
        }
        return "Right. And with that i shall retire good sir.";
    } 

    public String yellsStuff(String words){
        int lengthOfWords = words.length();
        if (lengthOfWords > 10){
            return "Alfred YELLS!";
        }
        return words;
    }
}