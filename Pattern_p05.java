package Pattern;

import java.util.Scanner;

public class Pattern_p05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern_p05.patter(n);
    }
    public static void patter(int n)
    {
        for (int i = 1;i <= n;i++)
        {
            for (int j = n;j >= i;j--)   // --> for(int j = 0 ;j < n-i+1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
