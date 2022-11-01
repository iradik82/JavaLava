package repls;

public class MainTESTrepl176 implements ChildInterface {

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        MainTESTrepl176 mainTEST=new MainTESTrepl176();
        mainTEST.parentMethod();
        mainTEST.childMethod();
    }
}
