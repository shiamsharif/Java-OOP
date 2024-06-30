package Constructor;

public class Human {

    String name;
    int age;
    double weight;
    
    // Constructor:
    Human(String name, int age, double weight){
         // human1.name = name;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name +" is eating.");
    }

    void drink(){
        System.out.println(this.name + " is drinking.");
    }
}
