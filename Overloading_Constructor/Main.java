package Overloading_Constructor;

public class Main {
    public static void main(String[] args) {
        // overloading constructors = multiple constructors within a class with the same name, but have different parameters or arguments. 

        Pizza pizza = new Pizza(
        "thicc crust", 
        "tomato",
        "mozzerella", "pepporoni");

        Pizza pizzaFoAkaaApu = new Pizza(
        "thicc crust", 
        "mozzerella", "pepporoni");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        System.out.println();

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizzaFoAkaaApu.bread);
        //System.out.println(pizzaFoAkaaApu.sauce); // null
        System.out.println(pizzaFoAkaaApu.cheese);
        System.out.println(pizzaFoAkaaApu.topping);


    }
}
