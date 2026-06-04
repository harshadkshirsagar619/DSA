package BasicMaths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to Reverse...");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int min = Math.min(n1,n2);

        for (int i = min; i>=1 ;i--)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                System.out.println("GSD is : "+i);
                break;
            }
        }

        System.out.println("---------------------");

        System.out.println("Enetr the number to Reverse...");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a > 0 && b > 0)
        {
            if (a > b)
            {
                a = a % b;
            }else {
                b = b % a;
            }
        }
        if (a==b)
        {
            System.out.println(b);
        }else {
            System.out.println(a);
        }
    }
}
