package repls;

public class repl140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
    Method should be visible only within same package!
     */

    static String maxLength(String[] arr) {
        String back="";
        for (int i = 0; i < arr.length ; i++) {

          if(arr[i].length()>back.length()) {
              back = arr[i];
          }


        }
return back;
    }


    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}