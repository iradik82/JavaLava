package JavaClasses.java23class161022AbstractInterface;

public abstract class Animal {

    abstract void eat();
    abstract void sleep();
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println(" Cats like fish");
    }

    @Override
    void sleep() {
        System.out.println("Cats like to sleep 12 to 16 h");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm hmm");
    }
}
class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dogs like watermelon");
    }

    @Override
    void sleep() {
        System.out.println("Dogs like to sleep 8 to 10 h");
    }
}
