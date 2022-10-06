import java.util.Date;
class VoiceMessageTest{
    public static void main(String[] args){

        VoiceMessageUtil messageUtil = new VoiceMessageUtil();

        System.out.println(messageUtil.greeting("Lazaro"));
        System.out.println(messageUtil.greeting("Lazaro", "Alvarez"));

        System.out.println(messageUtil.greeting(30));
        messageUtil.getTodaysDate();
    }
}