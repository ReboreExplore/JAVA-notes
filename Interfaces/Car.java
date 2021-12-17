
public class Car implements Vehicle {
    // We have to define the methods we have mentioned in the interface Vehicle
    private int gear=0;
    private int speed=1;
    
    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int change){
        this.speed+=change;
    }
    public void slowDown(int change){
        this.speed-=change;
    }
    public void display(){
        System.out.println("I am a car, going " + this.speed + "km/h and I am in gear "+ this.gear);
        out(); // calling the default method directly
    }
    
}