
public class Dog{
    //public is used when we intend to inherit the class
    public String name; // Attributes of the class
    public int age; // public too can be used but for attributes private is preffered
    // protected int age; - this keyword is used when we want the access the variable within all the classes fo the package

    // Create constructor method - This will run automatically whenever the Dog class is getting called and there is usually one such in each class

    public Dog(String name, int age) {
        this.name = name; // this keyword refers to the attributes
        this.age = age;
        add2(); 
    }

    public void speak(){
        System.out.println("I am "+ this.name+" and I am "+this.age+" years old");   
    }

    public int getAge() {
        return this.age;    
    }
    private int add2(){
        //private methods can only be used within class
        return this.age +2;
    }
    
}
