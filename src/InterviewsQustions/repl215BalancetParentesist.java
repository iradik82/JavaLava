package InterviewsQustions;

import java.util.Stack;

public class repl215BalancetParentesist {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[][](())[]{}}"));
    }

    public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char pop_val = stack.pop();
                    if (s.charAt(i) == ')' && pop_val != '(') {
                        return false;
                    } else if (s.charAt(i) == '}' && pop_val != '{') {
                        return false;
                    } else if (s.charAt(i) == ']' && pop_val != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}