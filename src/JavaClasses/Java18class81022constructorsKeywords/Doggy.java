package JavaClasses.Java18class81022constructorsKeywords;

public class Doggy extends Animal {


    String color;


    double height;

    public Doggy(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Doggy(String name, String breed, String color, int age, double weight, double height) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;*/
        this(name, breed, color, age, weight);
        this.height = height;
    }
}
