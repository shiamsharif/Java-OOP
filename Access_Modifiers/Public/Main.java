package Access_Modifiers.Public;

public class Main {

    //public-	The code is accessible for all classes
    public static void main(String[] args) {
        Second second = new Second();

        System.out.println("Name: " + second.fname + " " + second.lname);
        System.out.println("Email: " + second.email);
        System.out.println("Age: " + second.age);
    }
}
