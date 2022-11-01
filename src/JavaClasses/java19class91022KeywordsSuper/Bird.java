package JavaClasses.java19class91022KeywordsSuper;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    public Bird(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color "+color+" Age "+age+" weight "+weight);
    }
}
class Parrot extends Bird {
    Parrot(String name, String color, int age, double weight) {

           super(name, color, age, weight);

        /* this.name = name; this.color = color;this.weight = weight; this.age = age;  */
    }
}
class Crow extends Bird {
    Crow(String name, String color, int age, double weight) {

        super(name, color, age, weight);
    }
}
class test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2,1);
        parrot.printInfo();

        Crow crow=new Crow("crow","black",3,1.5);
        crow.printInfo();
    }
    }

