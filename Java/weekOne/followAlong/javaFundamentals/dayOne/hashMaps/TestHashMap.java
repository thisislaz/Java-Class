import java.util.HashMap;
import java.util.Set;
public class TestHashMap{
    public static void main(String[] args){
        //this creates the hashmap
        HashMap<String, String> userMap = new HashMap<String, String>();

        //this is adding to the hashmap
        //              key                 value
        userMap.put("lazaro@some.email", "lazaro");
        userMap.put("kori@some.email", "karina");
        userMap.put("diplo@dog.com", "diplo");

        //pulling the info out of the hashmap
        String variable = userMap.get("diplo@dog.com");//prints qbi
        String variable2 = userMap.get("kori@some.email");//prints karina
        String variable1 = userMap.get("lazaro@some.email");//prints lazaro
        System.out.println(variable +"\n"+variable1+"\n"+ variable2 );

        Set<String> someKey = userMap.keySet();
        for(String oneKey : someKey){
            System.out.println(oneKey);
            System.out.println(userMap.get(oneKey));
        }
    }
}