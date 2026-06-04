package BasicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to check Palindrome...");
        int n = sc.nextInt();

        int rev = 0;
        int dup = n;
        while (n > 0)
        {
            int lastNumber = n % 10;
            n = n / 10;
            rev = (rev * 10)+lastNumber;
        }
        System.out.println(rev);
        if (rev == dup)
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
