package repls;

public class fibofibo {
    public static void main(String[] args) {

        int a,b,c;
        a=1;
        b=1;

        for (int i = 1; i <=10 ; i++) {
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }


    }
}
