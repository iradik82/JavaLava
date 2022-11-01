package repls;

public class repl141 {


    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        repl141 rep=new repl141();
        rep.maxValue(arr);
         //should print 22
    }

    void maxValue(int[] arr) {
        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        System.out.println(big);

    }
}

