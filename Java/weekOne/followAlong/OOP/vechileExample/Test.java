public class Test{

    public static void main(String[] args){
        Vechile newCar = new Vechile("Ford", "Mustang", "red", 1912);
        String myCar = String.format("this car is a %d %s %s %s", newCar.year, newCar.color, newCar.make, newCar.model);
        System.out.println(myCar);
    }
}