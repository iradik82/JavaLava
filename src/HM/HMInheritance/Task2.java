package HM.HMInheritance;

public class Task2 {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B

     */

    String name;
    String lastName;
    int age;

    public Task2(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void lol() {
        System.out.println("Name " + name + " lastName " + lastName + " age " + age);

    }
}

    class Task22 extends Task2{


        public Task22(String name, String lastName, int age) {
            super(name, lastName, age);
        }
    }

    class Test33{
        public static void main(String[] args) {
            Task22 stud=new Task22("Ivan","Radik",26);
            stud.lol();
        }
    }

