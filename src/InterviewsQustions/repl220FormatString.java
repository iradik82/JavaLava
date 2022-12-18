package InterviewsQustions;

public class repl220FormatString {
    public static void main(String[] args) {
        System.out.println(formatString("23-432.423,miki12"));
    }

    public static String formatString(String S){
       S= S.replaceAll("[^0-9]","");

       StringBuffer bob=new StringBuffer(S);

        for (int i = 3; i <bob.length() ; i+=4) {
        bob.insert(i,"-");
        }
      S=bob.toString();

return S;
    }
}
