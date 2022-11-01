package repls;

public class repl68 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i-=2) {
            for (int b = 1; b < i; b++) {
                System.out.print("$"+" ");
            }
            System.out.println();
        }
    }
}
