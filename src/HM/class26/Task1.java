package HM.class26;

import java.util.ArrayList;

/*
Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
 Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
  Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Insurance>insurances=new ArrayList<>();
        insurances.add(new Car("Tesla","Geico"));
        insurances.add(new Pet("Heimark","Retriever"));
        insurances.add(new Health("UPMC"));
        System.out.println(insurances);

        for (Insurance i:insurances
        ) {
            i.getQuote();
            i.cancelInsurance();
        }



    }

}
abstract class Insurance {
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }


   abstract void getQuote();
   abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}class Car extends Insurance{
    String carModel;
   Car( String carModel,String insuranceName){
       super(insuranceName);
       this.carModel=carModel;
   }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 3% of "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }
}class Pet extends Insurance{
    String petType;


    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 1500USD for "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 550$ for yor Health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
