package ReviewClass;

public class Teacher {

    String name, lastName;
    int experience;
    String subject;
    double salary;
    static String school;

    Teacher(String Fname, String lName) {
        name = Fname;
        lastName = lName;

    }

    /*
    when you create a constructor
    COMPILER is NOT going to create
    a default constructor for you
     */
    void print() {
        System.out.println(name + " " + lastName);
    }

}
