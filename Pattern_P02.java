package Pattern;

import java.util.Scanner;

public class Pattern_P02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pattern_P02.Pattern(n);

    }

    public static void Pattern(int n)
    {
        for (int i = 0;i<n;i++)
        {
            for (int j = 0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
