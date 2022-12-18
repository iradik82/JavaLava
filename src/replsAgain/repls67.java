package replsAgain;

public class repls67 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.print(i);
            for (int j = 2; j <= 10 ; j++) {
                System.out.print(" "+j*i);
            }
            System.out.println();
        }
    }
}
