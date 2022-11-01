package repls;

public interface repl177Outputs {
    void display(String result );
}
interface Functions extends repl177Outputs{
    double adding(double firstNumber,double secondNumber);
    double subtracting(double firstNumber,double secondNumber);
    double multiply(double firstNumber,double secondNumber);
    double dividing(double firstNumber,double secondNumber);

}
class Mainb implements Functions{
    double firstNumber=100.00;
    double secondNumber=20.00;
    @Override
    public void display(String result) {
        result="Result is ::: ";
        System.out.println(result);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        double a=firstNumber+secondNumber;
        return a;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        double a=firstNumber-secondNumber;
        return a;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        double a=firstNumber*secondNumber;
        return a;

    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        double a=firstNumber/secondNumber;
        return a;
    }

    public static void main(String[] args) {

        Mainb mainb=new Mainb();
        double firstNumber=100.00;
        double secondNumber=20.00;

        System.out.println("Result is :::"+ mainb.adding(firstNumber,secondNumber));
        System.out.println("Result is :::"+ mainb.subtracting(firstNumber,secondNumber));
        System.out.println("Result is :::"+ mainb.multiply(firstNumber,secondNumber));
        System.out.println("Result is :::"+ mainb.dividing(firstNumber,secondNumber));


    }



}