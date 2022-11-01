package HM.HMOverLoadedMethods;
/*
 Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with specific arguments and observe result.
 */
public class Task3OverLoad {

    Task3OverLoad(){

    }

    static void bob(int a,int b,int c){
        System.out.println("sum = "+(a+b+c));
    }
    static void bob(char a,char b,char c){
        String n="";
        n=n+a+b+c;
        System.out.println("Here's your 3 UpperCase symbol "+n.toUpperCase());
    }
    static void bob(int a,char b ,double c){
        System.out.println("int = "+a+" char = "+b+" double = "+c);
    }
}
class lolka{
    public static void main(String[] args) {
        Task3OverLoad non= new Task3OverLoad();
        non.bob(2,1,34);
        non.bob('a','b','c');
        non.bob(26,'A',18.5);

    }
}
