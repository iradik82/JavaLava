package HM.HM1;

public class MethodsEvenOdd {
/*
Create a method that will take a number
and prints whether the number is even or odd.
 */

    void check(int num){
        if (num%2==0){
            System.out.println(num+" is EVEN");
        }else{
            System.out.println(num+" is ODD");
        }
    }


    public static void main(String[] args) {
        MethodsEvenOdd lol=new MethodsEvenOdd();

        lol.check(43);
        lol.check(22);
    }

}
