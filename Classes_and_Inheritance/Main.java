import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Dog tim = new Dog("tim",4); // Create a new instance of class Dog
        tim.speak(); // Access a method of class dog
        
        int x = tim.getAge(); // Access another method from class Dog
        System.out.println(x);

        Cat tom = new Cat("tom",8,20);
        tom.speak();
    }
}
