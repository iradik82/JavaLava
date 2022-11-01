package repls;

public class repl174 implements MyInterface{
    public static void main(String[] args) {
        MyInterface repo = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("implementation of method1");
            }

            @Override
            public void method2() {
                System.out.println("implementation of method2");
            }
        };

        repo.method1();
        repo.method2();
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
interface MyInterface{
    void method1();
    void method2();
}
