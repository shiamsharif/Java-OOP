package Object_Passing;

public class Main {
    public static void main(String[] args) {
        
        Garage garage = new Garage();

        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");

        garage.paek(car);
        garage.paek(car2);
    }
}
