package repls;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public class repl204 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> pairs=new LinkedHashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");

        Iterator<Map .Entry<String,String>> itr= pairs.entrySet().iterator();
        while(itr.hasNext()){
            var entry=itr.next();
            System.out.println(entry.getValue());
        }
    }
}
