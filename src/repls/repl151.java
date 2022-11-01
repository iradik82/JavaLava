package repls;

public class repl151 {

    static int matha(int[][] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int b = 0; b < a[i].length; b++) {
                sum = sum + a[i][b];
            }
        }


        return sum;
    }


        public static void main(String[] args) {
            int[][] a = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9,}
            };

            System.out.println(matha(a));
        }
    }
