package HM.class27;

import java.util.Collection;
import java.util.HashMap;

public class task5topEmployee {
    public static void main(String[] args) {

        HashMap<String,Integer>employee=new HashMap<>();
        employee.put("Ivan",180000);
        employee.put("Anton",120000);
        employee.put("Robert",65000);
        employee.put("Adam",12000);

        Collection<Integer> valemplo = employee.values();
        int max=0;
        var name="";
        for (int value:valemplo) {

            if(value>max){
           max=value;
            }
        }
        var all =employee.entrySet();
        for(var item:all){
            if(item.setValue(max)==max){
                name= item.getKey();
            }
        }
        System.out.println(name+"=$"+max);

    }
}
