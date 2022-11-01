package JavaClasses.java15Class21022DifferentMethods;

public class Main {

        void censorLetter(String w1, char w){
             w1 = w1.replaceAll(String.valueOf(w), "*");
            System.out.println(w1);
        }

        public static void main(String[]args){
            Main main=new Main();

            main.censorLetter("computer science",'e');
        }

}
