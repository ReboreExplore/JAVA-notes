
public class Main {
    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        Student tom = new Student("Joe");

        System.out.println(joe==bill); // Objects are compared and they are printing unique names even if they have the same names
        System.out.println(joe.equals(bill)); // This method from the Student class does the comparision correctly
        System.out.println(joe.equals(tom));

        System.out.println(joe.compareTo(tom)<0); // Other comparision operators can also be used

        System.out.println(bill); // Outputs - Student(Bill)
    }
}
