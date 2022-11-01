package HM.HMCollectionsArrayList;

import java.util.ArrayList;

public class HMArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> Fname=new ArrayList<>(5);
        Fname.add("Ivan");
        Fname.add("Mike");
        Fname.add("Peter");
        Fname.add("Nazar");
        Fname.add("Ostap");
        System.out.println("Is that array is empty? " +Fname.isEmpty());
        System.out.println("Is Ivan name present in that array? = "+Fname.contains("Ivan"));
        System.out.println("Is Robert name present in that array? = "+Fname.contains("Robert"));
        System.out.println("Size of that array is "+Fname.size());

        ArrayList<String> Ffname=new ArrayList<>(5);
        Ffname.add("Ivan");
        Ffname.add("Mike");
        Ffname.add("Peter");
        Ffname.add("Nazar");
        Ffname.add("Ostap");

        ArrayList<String> names1=new ArrayList<>(5);
        names1.addAll(Fname);
        names1.addAll(Ffname);
        System.out.println(names1);

    }
}
