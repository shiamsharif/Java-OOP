package Access_Modifiers.Default;

// default -	The code is only accessible in the same package. This is used when you don't specify a modifier. 

class Person {
    String fname = "John";
    String lname = "Doe";
    String email = "john@doe.com";
    int age = 24;
    
    public static void main(String[] args) {
      Person myObj = new Person();
      System.out.println("Name: " + myObj.fname + " " + myObj.lname);
      System.out.println("Email: " + myObj.email);
      System.out.println("Age: " + myObj.age);
    }
  }
  