package repls;

public interface FirstInterface {
    void  firstMethod();


}
interface SecondInterface{
    void secondMethod();
}
class Pop implements FirstInterface, SecondInterface {
    public static void main(String[] args) {
Pop pop=new Pop();
pop.firstMethod();
pop.secondMethod();
    }

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

}
