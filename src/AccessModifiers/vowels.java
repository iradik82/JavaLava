package AccessModifiers;

public class vowels {
    /*
    Create a method that will accept a String as a parameter and return
    a new String that consist only of vowels. Method should be available
    inside the class only where it was declared and executed by calling it is name.
     */


    private static String dodo(String w3) {
        String newStr = w3.replaceAll("[^aeiouAEIOU]", "");

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(dodo("hello my dear friends today i'm going to teach you"));
    }
}