
public class Main {
    public static void main(String[] args) {
        // Create an enum instance
        Level lvl = Level.LOW;
        //Print different values of the enum into the screen
        lvl.setLvl(5);
        System.out.println(lvl.getlvl());

        System.out.println(Level.valueOf("LOW"));

        /*
        Level[] arr = Level.values();
        
        for(Level e: arr){
            System.out.println(e);
        }

        if(lvl == Level.LOW){
            System.out.println(lvl);
        }else if(lvl == Level.MEDIUM){
            System.out.println(lvl);
        }else {
            System.out.println(lvl);
        }
        */
}
