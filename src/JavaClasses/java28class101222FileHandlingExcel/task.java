package JavaClasses.java28class101222FileHandlingExcel;

import java.util.HashMap;

public class task {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        /*var it=items.entrySet().iterator();
        while (it.hasNext()){
            var item=it.next();
            var key=item.getKey();
            var val=item.getValue();
            if(key.contains("e")&&val>10) {
                it.remove();
            }
        }*/
        System.out.println(items);


            items.entrySet().removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10);

    }
}
