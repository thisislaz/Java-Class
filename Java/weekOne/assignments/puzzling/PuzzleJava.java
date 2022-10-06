import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls(){
        
        ArrayList<Integer> randomNum = new ArrayList<Integer>();
        Random dice = new Random();
        for(int i =1; i<=10; i++){
            randomNum.add(dice.nextInt(20) + 1);
        }
        return randomNum;
    }

    public String getRandomLetterWithArray(){
        Random rand = new Random();

        String abcString = "abcdefghijklmnopqrstuvwxyz";
        String[] abc = new String[26];
        for(int i=0; i<26; i++){
            abc[i] = String.valueOf(abcString.charAt(i));
        }
        return abc[rand.nextInt(26)];
    }

    public String getRandomLetter() {

        Random rand = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabetString.charAt(rand.nextInt(26));

        return String.valueOf(randomChar);
    }

    public String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;

    }

}