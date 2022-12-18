package InterviewsQustions;

public class repl226ReverseStringNoStringBuilder {
    public static void main(String[] args) {
        System.out.println(reverse("Hello name my is Ivan herro my"));
        System.out.println(toreverse("Hello name my is Ivan herro my"));
    }

    public static String reverse(String strToRev){

        String[]arr=strToRev.split(" ");
        String reverse="";
        int size= arr.length;
        for (int i = 0; i < arr.length ; i++) {
            if(size==1){
                reverse=reverse+arr[0];
            } else  {
                reverse=reverse+arr[size-1]+" ";
                size--;
            }
        }

        return reverse;
    }
    public static String toreverse(String strToRev) {
   String toReverse="";
   String[]array=strToRev.split(" ");
        for (int i = array.length-1; i >=0 ; i--) {
            toReverse=toReverse+array[i]+" ";
        }
        return toReverse;
    }
}
