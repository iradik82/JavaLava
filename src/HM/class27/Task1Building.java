package HM.class27;

import java.util.LinkedHashMap;

/*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map

 */
public class Task1Building {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>building=new LinkedHashMap<>();
        building.put(1,"Balenciaga");
        building.put(2,"Syntax");
        building.put(3,"Gucci");
        building.put(4,"H&M");
        building.put(5,"Zoom");
        building.put(6,"Google");
        building.put(7,"Youtube");

        System.out.println("enterie = "+building.size());
        building.forEach((k,v)-> {System.out.println(k+" "+v);});
        building.put(4, "Apple");
        building.get(4);
        building.remove(7);
        System.out.println("--------------");
        building.forEach((k,v)-> {System.out.println(k+" "+v);});
    }
}
