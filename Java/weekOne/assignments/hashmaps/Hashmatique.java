import java.util.HashMap;

public class Hashmatique{

    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Mr.Moom", "Its a real cold mooon....");
        map.put("Dog Day", "Dog day baybee");
        map.put("For whom the bell", "Look to the sky rhy before you die");
        map.put("LALAl", "who boy hahah LALA");

        String val = map.get("Dog Day");
        System.out.println(val);

        for(String key : map.keySet()){
            System.out.println(String.format("Track: %s Lyrics: %s", key, map.get(key)));
        }
    }
}