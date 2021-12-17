// This code will contain the usage of Java in If-else, For Loops and While Loops
import java.util.Scanner; // For using Scanner class

public class Main {
    
    public static void name(String[] args) {
        // Define a Scanner class instance
        Scanner sc = new Scanner(System.in);
        // Take a string input
        String s = sc.nextLine();
        
        // Using if-else/if-else if-else to compare string
        
        if(s.equals("tim")) {
            System.out.println("You typed tim");
        }
        else if (s.equals("Hello")){
            System.out.println("You typed Hello"); 
        }
        else{
            System.out.println("You did not type tim or hello");
        }
        // For if-else we can also have nested one i.e one if else block inside another.

        
        // Arrays
        
        // Defining a new empty array with length 5
        String[] newArr = new String[5];
        // Assigning Array elements o its indices
        newArr[0] = "hello0";
        newArr[1] = "hello1";
        newArr[2] = "hello2";
        newArr[3] = "hello3";
        newArr[4] = "hello4";
        // Another way of defining array
        int[] nums = {2,3,4,5,6};
        // Extracting and Printing the array elements
        int x = nums[4];
        System.out.println(x);

        // for loops

        // For loop for printing elements from 0 to 10
        for(int i = 0; i<=10;i+=2){
            System.out.println(i);
        }
        // For loop can also be used to print elements of an array
        int[] arr = {1,5,7,4,5};
        for (int i = 0;i<=arr.length;i++){
            System.out.println(i);
        }
        // Another variation of for loop
        for(int element:arr){
            System.out.println(element);
        }
        sc.close(); // Close the scanner method
        // While an do-while loop
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Type a number:...");
        int y = scan.nextInt();
        // While Loop
        while(y!=10){
            System.out.print("Type 10..");
            System.out.print("Type a number");
            y = scan.nextInt();
        } 
        // Do-while loop
        int z;
        do {
            System.out.print("Type a number:...");
            z = scan.nextInt();
        } while(z != 10);
        scan.close();

    
    }
}
