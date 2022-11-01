package repls;

public class repl169 {
    public static void main(String[] args) {
        avg av=new avg();
        int[] a = {2,7,3,8,4};
        System.out.println(av.avgElements(a)); //should print 4.8
    }
}

class avg{

    final double avgElements(int []a){

        int b=a.length;
        double c=0;
        for (int i = 0; i <a.length ; i++) {
            c=c+a[i];

        }
                c=c/b;
                return c;
    }
}

