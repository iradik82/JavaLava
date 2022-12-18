package HM.HMiarrayList;

import java.util.ArrayList;

public class drinkslist {
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Vodka");
        drink.add("Tequila");
        drink.add("Whisky");
        drink.add("Absent");
        drink.add("Marine");
        drink.add("Milk");

        for (int i = 0; i <drink.size() ; i++) {
            if(drink.get(i).contains("a")||drink.get(i).contains("e")){
                drink.set(i,"Water");
            }
        }

       /* var iterator = drink.iterator();
        while (iterator.hasNext()) {
            var item =iterator.next();
            if (item.contains("a")||item.contains(("e"))) {
            drink.set(drink.indexOf(item),"Water");

            }*/
        System.out.println(drink);
        }

    }
