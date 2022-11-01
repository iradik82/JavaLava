package repls;

public class repl152 {
    public static void main(String[]args){
        Child child=new Child("Viena");
    }
}


class Parent{
    String city;

    Parent(String city){
        this.city=city;
        System.out.println(city);
    }

    Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(String city){
this.city=city;
    }
}