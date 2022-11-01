package JavaClasses.Java18class81022constructorsKeywords;

public class Cat extends Animal {


  /*  public static void main(String[] args) {
        Cat catObject = new Cat();
        catObject.name = "Laiala majno";
        catObject.breed = "Persian";
        catObject.age = 5;
        catObject.weight = 15;
    }
    */

     /*  public Cat(){
            System.out.println(name);
        }*/


    public Cat(String catName, String catBreed, int catAge, double catWeight) {
        name = catName;
        breed = catBreed;
        age = catAge;
        weight = catWeight;
    }

    public Cat(String catName, String catBreed) {
        name = catName;
        breed = catBreed;
    }

        public void printInfo () {
            System.out.println("Name " + name + " breed " + breed + " age " + age + " weight " + weight);

        }



}