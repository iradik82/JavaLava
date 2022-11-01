package JavaClasses.Java18class81022constructorsKeywords;

public class catTester {
    public static void main(String[] args) {
       /* Cat catObject=new Cat();
        catObject.name="Laiala majno";
        catObject.breed="Persian";
        catObject.age=5;
        catObject.weight=15;
        */

        Cat cat=new Cat("kitty","Dsh",10,4);
        cat.printInfo();

        Cat cat2=new Cat("Chinki","Leo");
        cat2.printInfo();




    }
}
