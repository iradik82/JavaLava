package InterviewsQustions;

import java.util.Stack;

public class repl215Practice {

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char pop_val = stack.pop();
                    if (str.charAt(i) == ')' && pop_val != '(') {
                        return false;
                    } else if (str.charAt(i) == '}' && pop_val != '{') {
                        return false;
                    } else if (str.charAt(i) == ']' && pop_val != '[') {
                        return false;
                    }
                }
            }


        }
        if (stack.isEmpty()) {
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(()){}[]"));

    }
}
