class Vechile{
    private int numberOfWheels;
    private String color;

    public Vechile(){

    }         

    public Vechile(String color){
        this.color = color;
    }

    public Vechile(String color, int num){
        this.color = color;
        this.numberOfWheels = num;
    }

    //getters
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    //setter
    public void setNumberOfWheels(int number){
        numberOfWheels = number;
    }

    //getter
    public String getColor(){
        return color;
    }

    //setter
    public void setColor(String color){
        this.color = color;
    }
}