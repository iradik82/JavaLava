package AccessModifiers;

public class ReverseMethod {

    /*
    Create a method that will take a String as a parameter
    and returns reversed String. Method should be available
    to all classes within your project and accessible by class name.
     */

    public static String dod(String w1){
      /*  String newStr;
        StringBuilder w2=new StringBuilder(w1);
        w2.reverse();
        newStr=w2.reverse();
        return newStr;*/
        return new StringBuilder(w1).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(ReverseMethod.dod("Hello"));
    }
}
