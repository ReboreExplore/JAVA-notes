//package JAVA-notes.STATIC Methods and Object Comparisions;

public class Dog {
    public String name; // Attributes of the class
    public int age; // public too can be used but for attributes private is preffered
    // protected int age; - this keyword is used when we want the access the variable within all the classes fo the package

    // We can also have static class variable i.e. variables that change altogether when the class is called and not with instances i.e not a instance variable
    protected static int count = 0;

    // Create constructor method - This will run automatically whenever the Dog class is getting called and there can be one]ly one such in each class

    public Dog(String name, int age) {
        this.name = name; // this keyword refers to the attributes
        this.age = age;
        add2(); 
        Dog.count+=1; // This variable will update and not refresh with every instance of Dog class called.
        Dog.display(); // Call the static method directly
    }

    private int add2(){
        //private methods can only be used within class
        return this.age +2;
    }
    // Static methods are used when we dont care about which instance we are running and we just want to do that even without creating instance.
    public static void display(){
        System.out.println("I am a dog");
    }
}
