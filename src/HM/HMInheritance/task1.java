package HM.HMInheritance;

public class task1 {
/*
Write program for multilevel inheritance where class C
inherits from class B and Class B inherits from Class A.
 */
    String name;
    String lastName;
    int age;
    int lol;

    public task1(String name, String lastName, int age, int lol) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.lol = lol;
    }
}

class task2 extends task1{
    double speed;
    char b;
    public  task2(String name, String lastName, int age, int lol,double speed,char b) {
        super(name, lastName, age, lol);
        this.speed = speed;
        this.b = b;
    }



}

class task3 extends task2{


    public task3(String name, String lastName, int age, int lol, double speed, char b) {
        super(name, lastName, age, lol, speed, b);
    }
}