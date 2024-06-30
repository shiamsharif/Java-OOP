package Inheritance;

public class Main {
    public static void main(String[] args) {
        //subclass (child) - the class that inherits from another class
        //superclass (parent) - the class being inherited from
        
        Car car = new Car();

        // car.go();


        Bicycle bicycle = new Bicycle();

        // bicycle.stop();


        System.out.println(car.doors);
        System.out.println(bicycle.padals);
    }
}
