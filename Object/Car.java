package Object;

public class Car {
    
    String make = "BMW";
    String model = "X7";
    int year = 2023;
    String color = "Black";
    double price = 50000.00;

    void drive(){
        System.err.println("You drive the car.");
    }
    
    void brake(){
        System.err.println("You stop on the brakes.");
    }

    public String toString(){
        return make+"\n"+model+"\n"+color+"\n"+year;
    }
}

    

