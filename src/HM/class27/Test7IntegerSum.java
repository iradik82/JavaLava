package HM.class27;

import java.util.HashSet;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Test7IntegerSum {
    public static void main(String[] args) {
        HashSet<Integer>nums=new HashSet<>();
        nums.add(12);
        nums.add(12);
        nums.add(42);
        nums.add(4);
        nums.add(45);
        nums.add(25);
        nums.add(25);

        int num=0;
        for(var num1:nums){
            num=num+num1;
        }
        System.out.println(num);
    }
}
