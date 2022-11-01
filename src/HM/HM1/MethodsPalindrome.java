package HM.HM1;

import java.util.Objects;

public class MethodsPalindrome {
    /*
    Create a method that will print whether given String is palindrome or not.
     */

    void palindrome(String word){
        String word1;
        StringBuilder pali=new StringBuilder(word);
        pali.reverse();
        word1= pali.toString();



        if (Objects.equals(word.toLowerCase(), word1.toLowerCase())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        MethodsPalindrome pali=new MethodsPalindrome();

        pali.palindrome("AbleWasIerEIsawelba");
    }
}
