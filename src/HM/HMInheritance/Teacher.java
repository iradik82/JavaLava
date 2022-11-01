package HM.HMInheritance;

public class Teacher {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */

   protected String name;
    protected int age;
    protected boolean diploma;
    String days_week;

    Teacher(String name, int age, boolean diploma, String days_week) {
        this.name = name;
        this.age = age;
        this.diploma = diploma;
        this.days_week = days_week;
    }
    void printInfo(){
        System.out.println(name+" "+age+" diploma? "+diploma+" working on "+days_week);
    }

     void startClass(){
        System.out.println("bell ring........class start");
    }
     void classOff(){
        System.out.println("bell ring........class ends");
    }
}

class MathTeacher extends Teacher{
    String LastName;

     MathTeacher(String name, int age, boolean diploma, String days_week,String LastName) {
        super(name, age, diploma, days_week);
        this.LastName=LastName;
    }

    public void testDay(){
        System.out.println("Today we have a quizz ,100 questions! good luck!");
    }
}
class ChemistryTeacher extends Teacher{
    String nickName;
    public ChemistryTeacher(String name, int age, boolean diploma, String days_week,String nickName) {
        super(name, age, diploma, days_week);
        this.nickName=nickName;
    }

    public void labaratory(){
        System.out.println("Please stop...");
    }
}

class PianoTeacher extends Teacher{
    boolean piano;
    public PianoTeacher(String name, int age, boolean diploma, String days_week,boolean piano) {
        super(name, age, diploma, days_week);
        this.piano=piano;
    }

    public void play(){
        System.out.println("Music is playing....");
    }
}

class tester1{
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher("Oksan",54,true,"Mn-Tu-Wd","Petrona");
       math.printInfo();
        math.startClass();
        math.testDay();
        math.classOff();


        ChemistryTeacher chemi =new ChemistryTeacher("Robert",35,true,"wd-frd","Alhimic");
        chemi.printInfo();
        chemi.startClass();
        chemi.labaratory();
        chemi.classOff();

        PianoTeacher piano=new PianoTeacher("Afrodita",29,false,"Wednesday",true);
       piano.printInfo();
        piano.startClass();
        piano.play();
        piano.classOff();


    }
}