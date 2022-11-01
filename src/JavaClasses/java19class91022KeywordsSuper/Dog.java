package JavaClasses.java19class91022KeywordsSuper;

public class Dog {

    String name;
    String breed;
    String color;

    public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Name " + name);
    }
}


    class Cat extends Dog{
        Cat(String name, String breed, String color) {
            super(name, breed, color);
        }
    }

    class TestAnimal{
        public static void main(String[] args) {
            Dog dog=new Dog("Lucky","Retriver","Gold");
            dog.printInfo();

            Cat cat=new Cat("Storm","Salami","Grey");
            cat.printInfo();
        }
    }

