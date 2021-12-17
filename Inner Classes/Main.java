// Here an implementation of inner class is shown
public class Main {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        //out.inner(); // when inner class was private
        
        // When Inner Class is public
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();

    }
}
