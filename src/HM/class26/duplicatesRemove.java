package HM.class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class duplicatesRemove {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String>list=new HashSet<>(aList);

        System.out.println(list);
    }
}
