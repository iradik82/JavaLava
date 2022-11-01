package ProojectClass;
/*
We have to calculate the average of marks obtained in three subjects by student A and by student B.
Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three subjects as
its parameters and the marks in four subjects as its parameters for student B. Test your code
 */

    public abstract class Marks {
        double subject1;
        double subject2;
        double subject3;

        abstract void getPercentage();

    }
    class A extends Marks{

        A(double subject1,double subject2,double subject3){
            this.subject1=subject1;
            this.subject2=subject2;
            this.subject3=subject3;
        }
        void getPercentage() {
            double Average = (subject1 + subject2 + subject3)/3;
            System.out.println(Average);
        }
    }
    class B extends A{
        double subject4;

        B(double subject1,double subject2,double subject3,double subject4){
            super(subject1,subject2,subject3);
            this.subject4=subject4;
        }
        void getPercentage() {

            double Average = (subject1 + subject2 + subject3 + subject4)/4;
            System.out.println(Average);
        }


    }
    class Tester {
        public static void main(String[] args) {
            Marks[] mark={new A(80,70,75),new B(90,100,68,87)};
            for(Marks Mark:mark){
                Mark.getPercentage();
            }

        }
    }


