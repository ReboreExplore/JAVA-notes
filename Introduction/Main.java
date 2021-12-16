// Java was developed by James Gosling and Patrick Naughton in the 1990's which helps to create nice resuable,modular code.
import java.util.Scanner; // Required for taking input

// Here a simple java program with input and output functionalities are shown

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World"); // This is the way we print out a string in java

        // Types of datatypes in java
        int a = 5;
        double b = 5.0;
        boolean c = false;
        char d = 'v'; //Note that char is only for character and not string
        String e = "Manpa";
        double f = 10.0;
        double g = f / b; // We can carry out mathematical operation slike '+','-','*','/','//' etc


        // Taking input in java requires to import the Scanner Class
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next(); // Type of scanned in String , next() method gives us a String
        // int scanned = sc.nextInt(); //nextInt() method gives an int
        // boolean scanned = sc.nextBoolean();
        // double scanned = sc.nextDouble();

        // Another workaround to convert datatypes - mostly preferred
        int x = Integer.parseInt(scanned);
        System.out.println(x);

        // Comparision Operators are similar to normal math comparators like >,<,==,>=,<= etc.
        int m = 2;
        int n = 5;
        boolean compare = m>=n; // This compare operators can be used for integers, floats, etc

        // For Strings comparisions are different
        boolean res = e.equals("Manpa"); 
    }