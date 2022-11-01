package ReviewClass.class5FinalAbstractInterface;

public class CarTest {
    public static void main(String[] args) {

        Car car= new Tesla("Tesla","X","Yellow" );
        car.drive();
        car.start();
        car.stop();
        //car.charge(); cannot use beacause comes from subclass

        Tesla tesla =new Tesla("Yellow","Tesla","Yellow");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();

        //new Car(); not possible because
    }
}
