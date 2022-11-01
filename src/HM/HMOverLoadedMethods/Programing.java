package HM.HMOverLoadedMethods;

/*
  Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
  then the message "I love programming languages" should be printed. If some String is passed to it,
  then in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
  then "I love Java" should be printed.
 */
 public class Programing {

    void bob(){
        System.out.println("i Love programming langueges");
    }
    void bob(String b){
        System.out.println("i love"+" "+b);
    }
}
 class bobik{
    public static void main(String[] args) {
        Programing prog=new Programing();
        prog.bob();
        prog.bob("Java");
    }
}
