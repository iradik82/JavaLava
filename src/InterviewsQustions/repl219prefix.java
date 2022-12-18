package InterviewsQustions;

import java.util.ArrayList;
import java.util.List;

public class repl219prefix {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");

        List<String> query = new ArrayList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");

        System.out.println(countOnlyPrefixes(names,query));
    }
    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query){
        
        ArrayList<Integer>conut=new ArrayList<>();

        for (String value : query) {
            int count = 0;
            for (String s : names) {
                if (s.contains(value)) {
                    if (s.equalsIgnoreCase(value)) {
                        continue;
                    }
                    count++;
                }
            }
            conut.add(count);
        }
        return conut;
    }
}
