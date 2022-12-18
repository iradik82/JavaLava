package replsAgain;

import java.util.Scanner;

public class repls31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        System.out.println("Do you need a loan?");
        boolean loan=true;

        if (loan){
            System.out.println("What is your credit score?");
            double score=750;
            if (score<600){
                System.out.println("Not eligible");
            }else if (score>=600 && score<=700){
                System.out.println("Maybe eligible");
            }else if (score>=701 && score<=800){
                System.out.println("Eligible");
            }else if (score>=801 ){
                System.out.println(" Definitely Eligible");
            }

        }else {
            System.out.println("The eligibility is Uknown");
        }




    }

}

