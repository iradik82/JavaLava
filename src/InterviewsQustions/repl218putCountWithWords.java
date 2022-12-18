package InterviewsQustions;

import java.util.LinkedList;
import java.util.List;

public class repl218putCountWithWords {
    public static void main(String[] args) {




        LinkedList<String> bobr = new LinkedList<>();
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("tv");
        bobr.add("switch");
        bobr.add("radio");


        System.out.println(countDeviceNames(bobr));
    }
    public static List<String> countDeviceNames(List<String> bobr) {

        List<String>words=new LinkedList<>(bobr);

        for (int i = 0; i <words.size() ; i++) {
            int num=1;
            for (int j = i+1; j <words.size() ; j++) {
                 if(words.get(i)==words.get(j)){
                     words.set(j, words.get(j) + num);
                     num++;
                }
            }
        }
        return words;
    }

}
