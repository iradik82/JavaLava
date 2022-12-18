package ReviewClass.class12Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demoset1 {
    public static void main(String[] args) {


        /*
        if we don't override equals method in our custom classes most of the collections framework will not
        work properly with those classes
         */
        Set<Studento> students=new LinkedHashSet<>(); //upcasting
        students.add(new Studento("Josh","plantin","123"));
        students.add(new Studento("Saira","Jawad","245"));
        students.add(new Studento("Mihan","Kalani","4565"));
        students.add(new Studento("Sonam","Koh","100"));
        System.out.println(students);

        List<Studento> setStudents=new ArrayList<>(students);
        System.out.println(setStudents.get(1));



    }
}
