package Overloading_Constructor;

public class Pizza {
    
    String bread;
    String sauce;
    String cheese;
    String topping;

    // overloading constructors: 
    Pizza(String bread, String cheese){
        this.bread = bread; 
        this.cheese = cheese;
    }
     // overloading constructors:
    Pizza(String bread, String cheese, String topping){
        this.bread = bread; 
        this.cheese = cheese;
        this.topping = topping;
    }
    // overloading constructors:
    Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
