package HM.HM1;

import java.util.Scanner;

public class MethodsLarger {
    void large(int num1,int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is largest");
        } else if (num2>num1) {
            System.out.println(num2 + " is largest");
        }else {
            System.out.println("Numbers is equal");
        }
    }

        public static void main(String[] args) {
            MethodsLarger lar = new MethodsLarger();
            Scanner scanner=new Scanner(System.in);
            System.out.println("pls enter the first number");
            int num=scanner.nextInt();
            System.out.println("pls enter the second number");
            int num1=scanner.nextInt();
            MethodsLarger obj= new MethodsLarger ();
            obj.large(num,num1);



    }

}
