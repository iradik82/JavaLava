package JavaClasses.Java18class81022constructorsKeywords;
public class Car{      //  <-common class has many different names like "parent" "super" class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    // if a field or method has private access modifier in parent class child classes can't use it.
    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }


}
 class BMW extends Car {   //  <--- child or derived
     double engineCC;

}


class Tesla extends Car {


}
class Toyota extends Car{
    double engineCC;
}

class CarTeste{
    public static void main(String[] args) {


        BMW bmw = new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="m8";
        bmw.printCarDetails();

        Tesla tesla=new Tesla();
        tesla.make="Tesla";
        tesla.color="White";
        tesla.model="X";
        tesla.printCarDetails();
    }
}