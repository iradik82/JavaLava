package ReviewClass.class5FinalAbstractInterface;
interface Drivable{
    // by default all variables public static final
    boolean DRIVES=true;
    //we cannot have a constructor it's not point of it

    //by default all methods are public abstract
    void breaks();

}

interface Vehicle{
    void hsveMotor();

    //from java 8 we can have static and default methods

    default void haveBreak(){
        System.out.println("breaks are working");
    }

}
// with help of abstract class we can achieve 0 to 100% abstraction
public abstract class Car {
    String color,make,model;
    public static final int WHEELS=4;

    public Car(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }
    void drive(){
        System.out.println("All cars can drive");
    }
    abstract void start();

    abstract void stop();
}
class Tesla extends Car implements Drivable,Vehicle{

    public Tesla(String color, String make, String model) {
        super(color, make, model);
    }

    @Override
    void start() {
        System.out.println(make+" Starts automat");
    }

    @Override
    void stop() {
        System.out.println(make + " turns off");
    }
    public void charge(){
        System.out.println("You need to charge");
    }

    @Override
    public void breaks() {
        System.out.println(make+ " never breaks");
    }

    @Override
    public void hsveMotor() {
        System.out.println(make+" has motor");
    }
}

