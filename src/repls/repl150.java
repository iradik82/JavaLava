package repls;

public class repl150 {

        String name;
        String LastName;
        int age;

     repl150(String name, String lastName, int age) {
        this.name = name;
        this.LastName = lastName;
        this.age = age;
    }
    void print(){
        System.out.println(name+" "+LastName+" "+age);
    }

}
class Employee extends repl150 {
    int salary;

    public Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }

    void print() {
        System.out.println(name + " " + LastName + " " + age + " " + salary);
    }
}

     class Student extends repl150 {
         int grade;

         public Student(String name, String lastName, int age, int grade) {
             super(name, lastName, age);
             this.grade = grade;
         }

         void print() {
             System.out.println(name + " " + LastName + " " + age + " " + grade);
         }
     }

        class Retiree extends repl150 {
            String seniorActivity;

            public Retiree(String name, String lastName, int age, String seniorActivity) {
                super(name, lastName, age);
                this.seniorActivity = seniorActivity;
            }

            void print() {
                System.out.println(name + " " + LastName + " " + age + " " + seniorActivity);
            }
        }


class Main{
    public static void main(String[] args) {
        Employee employee=new Employee("Joe","Smith",35,35000);
        employee.print();

        Student student=new Student("Adam","Smith",15,10);
        student.print();

        Retiree retiree=new Retiree("Frank","Smith",15,"tour");
        retiree.print();
    }
}