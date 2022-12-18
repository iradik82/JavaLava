package InterviewsQustions;

public class repl225ReverseNum {
    public static void main(String[] args) {
        System.out.println(reverseInteger(12345));
    }

    public  static int reverseInteger(int N){

        String num=""+N;
        StringBuilder reverse=new StringBuilder(num);
        reverse.reverse();
       num = reverse.toString();
      int New=Integer.parseInt(num);

return New;
    }
}
