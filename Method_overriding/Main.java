package Method_overriding;

public class Main {
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        Animal animal = new Animal();

        dog.speak();

        animal.speak();
    }
}


// class Animal {
//     public void displayInfo() {
//        System.out.println("I am an animal.");
//     }
//  }
 
//  class Dog extends Animal {
//     @Override
//     public void displayInfo() {
//        System.out.println("I am a dog.");
//     }
//  }
 
//  class Main {
//     public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.displayInfo();
//     }
//  }