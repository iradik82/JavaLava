package InterviewsQustions;

public class repl221FindLargestEvenLength {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("I love you Papara if you like"));
    }




    public static String findMaxLenEven(String str) {

        String[] lol=str.split(" ");
        String EvenLarge="";
        String b="-1";
        for (String s : lol) {
            if (s.length() % 2 == 0) {
                if (s.length() > EvenLarge.length()) {
                    EvenLarge = s;
                }
            }
        }
        if(EvenLarge.equals("")){
            return b;
        }

        return EvenLarge;
    }

}
