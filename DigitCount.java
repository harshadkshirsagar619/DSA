package BasicMaths;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to find count...");
        int n = sc.nextInt();


        int count = 0;
        while (n > 0)
        {
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}
