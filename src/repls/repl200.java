package repls;

import java.util.Collection;
import java.util.LinkedHashMap;

public class repl200 {
    public static void main(String[] args) {
        LinkedHashMap<String,String>pairs=new LinkedHashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");

        Collection<String>values=pairs.values();
        for(String v:values){
            System.out.println(v);
        }
    }
}
