package repls;

public class repl168 {

    final String reverse(String a){
        String str="";
        StringBuilder bob=new StringBuilder(a);
        str= str+ bob.reverse();
        return str;
    }
}
class Moin{
    public static void main(String[] args) {

        repl168 rep=new repl168();

        System.out.println(rep.reverse("hello"));
    }
}
