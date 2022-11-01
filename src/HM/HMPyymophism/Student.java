package HM.HMPyymophism;

/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {


    public void study() {
    }
}
class SyntaxStudent extends Student{
  public   void study(){
        System.out.println(" SyntaxStudent lesson begins at 7pm");
    }
    void stop(){
        System.out.println("break at 8:30pm");
}
    }
class CollegeStudent extends Student{
   public void study(){
        System.out.println("CollegeStudent lesson begins at 8am");
    }
    void lunch(){
        System.out.println("CollegeStudent Lunch at 1pm");
    }
}
class SchoolStudent extends Student{
    public void study(){
        System.out.println(" SchoolStudent lesson begins at 8:30am");
    }
}
class Main{
    public static void main(String[] args) {

        Student[] students= {new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(Student x:students){
            x.study();

        }
    }
}