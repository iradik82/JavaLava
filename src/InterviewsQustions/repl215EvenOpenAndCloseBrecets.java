package InterviewsQustions;

public class repl215EvenOpenAndCloseBrecets {
    public static void main(String[] args) {
        System.out.println(isBalanced(")((()"));
    }
    public static boolean isBalanced(String s) {

        //Stack<Character> stack = new Stack<>();
        int open = 0;
        int close = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
        }
        return open == close;
    }
    }