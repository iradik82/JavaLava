package HM.HM1;

public class PrimeNumber {

    boolean prime(int num){
        boolean prime=true;
        if(num>1){

            for (int i = 2; i<num; i++){
                if(num%1==0) {
                    return false;

                }
                }
            } else{
               return false;
            }

        return prime;
    }

    public static void main(String[] args) {
        PrimeNumber prim=new PrimeNumber();

        System.out.println(prim.prime(12));
        System.out.println(prim.prime(5));
    }
}
