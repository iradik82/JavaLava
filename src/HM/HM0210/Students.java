package HM.HM0210;

public class Students {
    /*
    Write a java Class Students that have a constructor which takes students
    name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks. Your program should print
    an average mark of each students name.
    NOTE: please use different names for instance and local variable
     */

    String name;
    double subj1;
    double subj2;
    double subj3;

    Students(String studName,double sub1,double sub2,double sub3){
        name=studName;
        subj1=sub1;
        subj2=sub2;
        subj3=sub3;
    }

    void calculatePrintAvgGrade(){
        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }

    public static void main(String[] args) {
        new Students("Saba",99,98,97.5).calculatePrintAvgGrade();
    }
}
