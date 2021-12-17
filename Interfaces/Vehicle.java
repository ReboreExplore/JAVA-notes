
public interface Vehicle {

    final int gears = 5; // final is like a constant. It can be changed

    // We cant create instances but can inherit interfaces to another class
    void speedUp(int a); // This method will exist in any of the classes but we dont give any content to the mehods inside of an interface
    void slowDown(int a);
    void changeGear(int a);

    default void out(){
        System.out.println("Default method");
    }

    static int math(int b) {
        return b+2;
    }
}
