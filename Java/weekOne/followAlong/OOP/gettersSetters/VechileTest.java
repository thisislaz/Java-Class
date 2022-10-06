class VechileTest{
    public static void main(String[] args){
        Vechile bike = new Vechile();
        Vechile car = new Vechile();

        bike.setNumberOfWheels(2);
        bike.setColor("red");
        int numberOfWheelsOnBike = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();

        car.setNumberOfWheels(4);
        car.setColor("green");
        int numberOfWheelsOnCar = car.getNumberOfWheels();
        String carColor = car.getColor();

        System.out.println("Bike object - \n Wheels: " + numberOfWheelsOnBike + ", Color: " + bikeColor);
        System.out.println("Car object - \n Wheels: " + numberOfWheelsOnCar + ", Color: " + carColor);

        Vechile redVechile = new Vechile("red");
        String color = redVechile.getColor();
        System.out.println("the vechile color is: " + color);
    }
}