package HM.class27;

import java.util.TreeMap;

/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
 */
public class Task4Person {
    private String name,lastName;
    private int age,salary;

    public Task4Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

     String printInfo() {
         return name+" "+lastName+" "+age+" "+salary;

     }
}
class test{
    public static void main(String[] args) {
        Task4Person perso1=new Task4Person("Ivan","Radetskyi",26,180000);
        Task4Person perso2=new Task4Person("Roman","Verkov",36,180000);
        Task4Person perso3=new Task4Person("Stepan","Lorkov",22,180000);


        TreeMap<String,Task4Person>person=new TreeMap<>();
        person.put("111",perso1);
        person.put("222",perso2);
        person.put("333",perso3);

        for(var values:person.values()){
            System.out.println(values.printInfo());
        }
        System.out.println("---------------");

        person.forEach((k,v)->{
            System.out.println("id #"+k+" "+v.printInfo());
        });


    }
}
