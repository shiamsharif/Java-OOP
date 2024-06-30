package Constructor;

public class Main {
    public static void main(String[] args) {

        //A constructor in Java is a special method that is used to initialize objects.The constructor is called when an object of a class is created.
        
        Human human1 = new Human("Shiam", 23, 56.6);
        Human human2 = new Human("Shaman", 28, 66.6);

        System.err.println(human1.name);
        System.err.println(human2.name);

        human1.eat();
        human2.drink();
    }
}
