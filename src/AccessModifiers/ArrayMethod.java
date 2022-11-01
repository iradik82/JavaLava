package AccessModifiers;

public class ArrayMethod {

    /*
    Create a method that will accept an array as parameters and will return
    a sum of all elements from that array. Method should be visibly only within
    same package and accessible by the creating an instance of the class.
     */
    
    int b(int[]v){
        int sum=0;
        for (int i=0;i< v.length;i++){
             sum=sum+v[i];
        }

        return sum;
    }



    }


