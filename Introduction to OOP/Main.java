// Java is an Object Oriented Programming Language
// Object is simply an instance of a datatype/classes

import java.util.Scanner;

public class Main {
    // stactic void main always runs under the main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creates a new instance sc of the object Scanner
        sc.next(); // Calling the next() method of the Scanner object
        String h = "hello"; // Here h is a String object with the value "hello"
        h.length(); // The String object h has a method length
        tim("manpa",2); // Calling the tim method with two arguments
        System.out.println(add2(4));
    }

    // Creating a tim method inside the main class
    public static void tim(String str, int x){
        for (int i=0;i<x;i++){
            System.out.println(str);
        }
    }

    // Creating a add2 method to add 2 to a number. int return type is used in this method
    public static int add2(int x){
        return x+2;
    }

}
