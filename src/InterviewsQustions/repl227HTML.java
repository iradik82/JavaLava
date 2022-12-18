package InterviewsQustions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class repl227HTML {
    public static void main(String[] args) {
        // System.out.println(HTMLElements("<div><b><p>hello</p></b></div>"));
        String str = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(HTMLElements(str));
    }
    public static String HTMLElements(String str) {
        List<String> words = new ArrayList<>();
        int L, R, i = 0;
        int n = str.length();
        while (i < n) {
            if (str.charAt(i) == '<') {
                R = i;
                while (str.charAt(R) != '>') {
                    R++;
                }
                R++;
                words.add(str.substring(i, R));
            }
            if (i > 0 && str.charAt(i - 1) == '>' && str.charAt(i) != '<') {
                L = i;
                while (str.charAt(L) != '<') {
                    L++;
                }
                words.add(str.substring(i, L));
            }
            i++;
        }
        Stack<String> stack = new Stack<>();
        String[] Open = {"<b>", "<i>", "<em>", "<div>", "<p>"};
        String[] Close = {"</b>", "</i>", "</em>", "</div>", "</p>"};
        String lol = "";

        for (String s : words) {
            if (Arrays.asList(Open).contains(s)) {
                stack.push(s);
                  }else if(Arrays.asList(Close).contains(s)&&
                 Arrays.asList(Open).indexOf(stack.peek())==Arrays.asList(Close).indexOf(s)) {
                stack.pop();
            }else if(Arrays.asList(Close).contains(s)&&
                    Arrays.asList(Open).indexOf(stack.peek())!=Arrays.asList(Close).indexOf(s)){
                lol=stack.peek();
            }
        }

        
            return lol;
    }
}