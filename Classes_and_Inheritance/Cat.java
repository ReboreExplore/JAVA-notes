// Here we inheit the Dog Class and all its methods to Cat
public class Cat extends Dog {
    
    private int food;
    public Cat(String name, int age, int food) {
        super(name,age);
        this.food = food;
    }

    // another constructor - we can call the class in either way
    public Cat(String name, int age){
        super(name,age);
        this.food = 50;
    }

    public Cat(String name){
        super(name,0);
        this.food = 50;
    }
    // Although all the methods of Dog class is inherited we can overwrite the method by create=ing one with the same name in the child class
        public void speak(){
        System.out.println("Meow , My name is "+ this.name+ " and I get fed " + this.food);
    }
}
