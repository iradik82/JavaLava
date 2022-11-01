package JavaClasses.java20class111022overLoadingMethod;

public class MethodOverLoading {
    void f1(String name, int number) {
        System.out.println(name + " " + number);
        System.out.println("String and int");
    }
    // by changing the number of parameters
    void f1(String name, int number, int number2) {
        System.out.println(name + " " + number+number2);
        System.out.println("String int int");
    }
    //By changing the data types
    void f1(int nam1,int number) {
        System.out.println(nam1 + " " + number);
        System.out.println("int int");
    }
    void f1(int number,String name ) {
        System.out.println(name + " " + number);
        System.out.println("int String");
    }

    public static void main(String[] args) {
        MethodOverLoading wd=new MethodOverLoading();
        wd.f1("Taras",20);
        wd.f1(10,10);
        wd.f1("Roman",20,13);
        wd.f1(45,"Andrean");
    }
}
