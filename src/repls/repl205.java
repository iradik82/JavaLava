package repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class repl205 {
    public static void main(String[] args) {
        HashMap<String,String> pairs=new HashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");

        Iterator<Map .Entry<String,String>> itr=pairs.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String,String>entry=itr.next();
            System.out.println(entry.getValue().toUpperCase());
        }
    }
}
