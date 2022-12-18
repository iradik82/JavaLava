package repls;

public class SyntaxStudentException extends Exception{
public  SyntaxStudentException(String st) {
    super(st);
}
}
class Mainv{
    public static String grade(int score) throws SyntaxStudentException{
       if(score>90){
           throw new SyntaxStudentException("You are an exceptionally awesome student");
       }else{
           return "You are a great student";
       }
    }
    public static void main(String[] args) {

        try {
            System.out.println(grade(95));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
