import java.util.ArrayList;
public class Developer {
    // attribuites should be private or protected
    private String name;
    private int yearsOfExperience;
    private double hoursOfSleep;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;

    //constructor
    public Developer(){
        this.name = "somebody";
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }

    public Developer(String name, int yearsOfExperience,double hoursOfSleep){
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
    }


    // methods
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("yearsOfExperience: " + this.yearsOfExperience);
        System.out.println("hoursOfSleep: " + this.hoursOfSleep);
        System.out.println("languages: " + this.languages);
        System.out.println("projects:");
        for(Project eachProject: this.projects){
            eachProject.displayInfo();
        }
    }

    public void addProject(Project project){
        this.projects.add(project);
    }
    public void setOneProject(Project project){
        this.projects.add(project);
    }

    public ArrayList<Project> getProjects(){
        return this.projects;
    }

    public Developer setProjects(ArrayList<Project> projects){
        this.projects = projects;
        return this;
    }


    //getter
    public String getName(){
        return this.name;
    }

    //setter
    public Developer setName(String name){
        this.name = name;
        return this;
    }

    //getter
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }

    //setter
    public Developer setYearsOfExperience(int yearsOfExperience){
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }

    public double getHoursOfSleep(){
        return this.hoursOfSleep;
    }


    public void setHoursOfSleep(double hoursOfSleep){
        this.hoursOfSleep = hoursOfSleep;
    }


}