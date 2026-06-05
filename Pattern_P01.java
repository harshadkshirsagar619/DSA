package Pattern;

import java.util.Scanner;

public class Pattern_P01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many time do you want ");
        int t = sc.nextInt();

        for (int i =0;i<t;i++) {
            int n;
            n = sc.nextInt();
            Pattern_P01.pattern(n);
        }
    }

    public static void pattern(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0;j < n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
