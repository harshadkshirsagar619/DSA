package Pattern;

import java.util.Scanner;

public class Pattern_p03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern_p03.pattern(n);

    }

        public static void pattern(int n) {

            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
        }
}
