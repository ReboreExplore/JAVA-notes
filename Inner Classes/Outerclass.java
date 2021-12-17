
public class OuterClass {
    /*
    private class InnerClass{
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner(){
        InnerClass in = new InnerClass();
        in.display();
    }
    */
    
    // We can also have public InnerClass
    public class InnerClass{
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner(){
        InnerClass in = new InnerClass();
        in.display();
    }
    // We can also write the inner class inside of any method
    // of outerclass
}
}
