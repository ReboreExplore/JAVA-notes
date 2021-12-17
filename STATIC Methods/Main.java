
public class Main {
    public static void main(String[] args) {
        // Create three instances of Dog Class
        Dog tim = new Dog("tim",4);
        tim.speak();
        Dog joe = new Dog("joe",2);
        joe.speak();
        Dog his = new Dog("hister",3);
        his.speak();

        System.out.println(Dog.count); // Calling Staic Class Directly without taking help from instance

}
}
