// Implementation of interfaces

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.speedUp(10);
        ford.display();
        int x = Vehicle.math(5); //Like this we can create a bunch of static methods inside an interface and use them directly        
        System.out.print(x);
    }
}
