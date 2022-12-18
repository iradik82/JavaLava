package InterviewsQustions;

import java.util.Arrays;

public class repl216ArraySunToZero {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumToZero(4)));

    }
    public static int[] sumToZero(int N) {

       int[]array=new int[N];
        if(N%2==0){
            int half=N/2;
            for (int i = 0; i <array.length ; i++) {
                 array[i]=half;
                 half=-half;
            }
        }else{
            int half=N/2;
            for (int i = 0; i <array.length ; i++) {
                array[i]=half;
                half=-half;
            }
            array[N-1]=0;
        }
return array;
    }

}
