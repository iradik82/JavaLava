package repls;

import java.util.LinkedHashMap;

public class repl201 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> pairs=new LinkedHashMap<>();
        pairs.put("Street","Patrick ST");
        pairs.put("Suite","265");
        pairs.put("City","Vienna");
        pairs.put("Zip","22180");
        pairs.put("Country","United State");

        System.out.println(pairs.size());
        pairs.clear();
        System.out.println(pairs.size());

    }
}
