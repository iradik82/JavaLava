package JavaClasses.java14Class100122;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Intellij is great");

        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);



        /* StringBuilder  allows any methods to change the original contents of the variables */
        /* because StringBuilder is mutable. */



      /*  String does not allow any methods to change the original contents of the variables
      because String is immutable */

        String str="Intellij ";
        str.toLowerCase();
        System.out.println(str);

      /* String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("New york");
        StringBuilder state2=new StringBuilder("New york");*/

        String str1="kjfksfAJDSKJD274362374!@##$";
        str= str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = " + str);

        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));

        //Mostly used class newer better faster
        StringBuilder stringBuilder1=new StringBuilder("Today is java class");
        // older one slow and not used mostly
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str2="Java is very easy";
    /*
    If we want to convert the String to a StringBuilder we can use the below
    syntax
     */
        StringBuilder stringBuilder2=new StringBuilder(str);
        System.out.println("stringBuilder2 = " + stringBuilder1);
        /*
        IF we want to convert from a StringBuilder to A String we can use
        the below syntax
         */
        String newStr=stringBuilder1.toString();

        String str3="This is sentence i want to reverse";
        String[] arr=str3.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
            StringBuilder stringBuilder3=new StringBuilder(word);
            stringBuilder.reverse();
            arr[i]=stringBuilder3.toString();
            st.append(arr[i]).append(" ");
        }
        System.out.println(st);

    }

}



