package HM.class26;

import java.util.LinkedHashSet;

/*
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.

 */
public class setdemo3 {
    public static void main(String[] args) {

        LinkedHashSet<Stud> student=new LinkedHashSet<>();
       student.add(new Stud("Roman","kjhdx7"));
       student.add(new Stud("Ivan","sdsds"));
       student.add(new Stud("Alica","kjhsdadx7"));
       student.add(new Stud("Katya","23dew"));

        for (Stud stud : student) {
            stud.printInfo();
        }





    }
}class Stud{
    String name;

    String id;

    public Stud(String name, String id) {
        this.name = name;
        this.id = id;
    }
    void printInfo(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

