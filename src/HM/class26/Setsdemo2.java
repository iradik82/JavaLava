package HM.class26;
/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
 Then remove any city that starts with “A”;
 */
import java.util.TreeSet;

public class Setsdemo2 {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Kyiv");
        countries.add("Warshava");
        countries.add("Krakov");
        countries.add("Pittsburgh");
        countries.add("Abudabi");

        System.out.println(countries);

        var it =countries.iterator();
        while(it.hasNext()){
if(it.next().startsWith("A")){
    it.remove();
}


        }
        System.out.println(countries);

    }
}
