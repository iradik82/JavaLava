package InterviewsQustions;

import java.util.*;

public class repl227onemore {
    public static <let> void main(String[] args) {
        String str = "<div>abc</div><p><em><i>test test test</b></em></p>";

        //String []lol=str.split("[<]");
        // System.out.println(Arrays.toString(lol));
        Stack<String> stack = new Stack<>();

        //  for (int i = 0; i < lol.length ; i++) {
        //  if(lol[i].startsWith("/")){
        //        stack.push(lol[i]);

        System.out.println(htmlElements(str));
    }
    public static String htmlElements (String str) {
        List<String> list = converToList(str);
        Stack<String> stack = new Stack<>();
        String[] openTags = {"<b>", "<i>","<em>", "<div>", "<p>"};
        String[] closeTags = {"</b>", "</i>","<em>", "</div>", "</p>",};
        String lol = "";

        for (String s : list) {
            if (Arrays.asList(openTags).contains(s)) {
                stack.push(s);
            } else if (
                    Arrays.asList(closeTags).contains(s) &&
                            Arrays.asList(openTags).indexOf(stack.peek()) ==
                                    Arrays.asList(closeTags).indexOf(s)
            ) {
                stack.pop();
            } else if (
                    Arrays.asList(closeTags).contains(s) &&
                            Arrays.asList(openTags).indexOf(stack.peek()) !=
                                    Arrays.asList(closeTags).indexOf(s)
            ) {
                lol = stack.peek();
                break;
            }

        }

        return lol;
    }
    public static List<String> converToList(String str) {
        List<String> list = new ArrayList<>();

        int left, right,  i = 0;
        int n = str.length();

        while (i < n) {

            if (str.charAt(i) == '<') {
                right = i;
                while (str.charAt(right) != '>') {
                    right++;
                }
                right++;
                list.add(str.substring(i, right));
            }

            if (i > 0 && str.charAt(i - 1) == '>' && str.charAt(i) != '<') {
                left = i;
                while (str.charAt(left) != '<') {
                    left++;
                }
                list.add(str.substring(i, left));
            }

            i++;
        }

        return list;
    }
}
