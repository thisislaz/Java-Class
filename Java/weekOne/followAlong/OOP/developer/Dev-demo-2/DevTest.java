import java.util.ArrayList;
public class DevTest {
    public static void main(String[] args){
        Developer dev1 = new Developer();
        Developer dev2 = new Developer("Bobby", 2 , 12.5);
        // can chain if methods return self.

        dev1.displayStatus();
        System.out.println("**************************\n");


        Project project1 = new Project();
        project1.title = "Lookify";
        project1.language = "Java";

        Project project2 = new Project();
        project2.title = "Netflix clone";
        project2.language = "MERN";

        dev2.setOneProject(project1);
        dev2.setOneProject(project2);
        dev2.displayStatus();



    }
}