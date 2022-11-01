package repls;

public abstract class repl172 {
    void m2(){
        System.out.println("Parent class providing implementation");
    }
    void m1(){};
}
class Mai extends repl172{
    public static void main(String[] args) {
        repl172 rep=new repl172() {
            @Override
            void m2() {
                super.m2();
            }

            @Override
            void m1() {
                System.out.println("Child class providing implementation");
            }
        };
        rep.m1();
        rep.m2();
    }
}
