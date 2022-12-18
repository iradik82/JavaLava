package ReviewClass.class12Collection;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {

    ArrayList<Studento> students=new ArrayList<>();
    students.add(new Studento("Josh","Plantin","123"));
    students.add(new Studento("Adam","Park","123"));
    students.add(new Studento("Yusuf","Engin","123"));
    students.add(new Studento("Cam","Jo","123"));

    // System.out.println(students);

    // coming up next how we can remove elements how we can access methods from a class

       /* for (Student student : students) {
            student.printName();
        }*/

    Studento joshAgain=new Studento("Josh","Plantin","123");
    System.out.println(students.contains(joshAgain));
    System.out.println(joshAgain);
    System.out.println(students);

}

}
