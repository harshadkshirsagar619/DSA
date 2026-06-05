package BasicMaths;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to check armstrong ...");
        int n = sc.nextInt();

        int sum = 0;
        int dup = n;
        while (n > 0)
        {
            int lastNumber = n % 10;
            n = n / 10;
            sum = sum + lastNumber * lastNumber * lastNumber;

        }
        System.out.println(sum);

        if (dup == sum)
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
