package BasicMaths;

import java.util.Scanner;

public class PrintAllDivisions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to print all divisors...");
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++)
        {
            if (n % i == 0)
            {
                System.out.print(i+ " ");
            }
        }
    }

}
