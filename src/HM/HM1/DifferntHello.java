package HM.HM1;

public class DifferntHello {
    /*
    Create a method that will say Hello in different language
    based on the country that will passed when method is executed
     */

   void lang(String Language){
       switch (Language) {
           case "Ukraine":
               System.out.println("Vetau");
               break;

           case "Poland":
               System.out.println("Den dobre");
               break;

           case "Slovakia":
               System.out.println("Chao");
               break;
           default:
               System.out.println("Country not supported");
       }
    }

    public static void main(String[] args) {
        DifferntHello lol=new DifferntHello();

        lol.lang("Ukraine");
    }
}
