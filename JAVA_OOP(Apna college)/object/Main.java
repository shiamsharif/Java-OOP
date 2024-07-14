class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("written something.");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

public class Main {

    public static void main(String[] args) {
        Pen obj1 = new Pen();
        obj1.color = "Black";
        obj1.type = "gel";

        Pen obj2 =  new Pen();
        obj2.color = "Blue";
        obj2.type = "bollpoint";

        obj1.printColor();
        obj2.printColor();
    }
}