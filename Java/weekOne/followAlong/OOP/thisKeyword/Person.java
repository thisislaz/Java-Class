class Person{
    private int age;
    private String name;
    private int cmHeight;
    public Person(){
        this(20,"John Doe", 171);
    }
    
    public Person(int ageParam, String nameParam){
        this.age = ageParam;
        this.name = nameParam;
    }

    public Person(int ageParam, String nameParam, int cmHeight){
        this.age = ageParam;
        this.name = nameParam;
        this.cmHeight = cmHeight;
        
    //you MUST use "this" if one of your parameter variables shares the same name as one of you member variables
    // this will not set the attribute value. 'age' is a local variable in the constructor method and its value is the very first argument;
        
        age = age;
    }

    public void objectMethods(Person anotherObject){
        System.out.println("class name: " + this.getClass().getSimpleName());
        System.out.println("tostring: " + this.toString());
        System.out.println("equals: " + this.equals(anotherObject));

    }
}