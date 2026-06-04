package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number to Reverse...");
        int n = sc.nextInt();


        int revNumber = 0;
        while (n > 0)
        {
            int lastDigit = n % 10;
          //  count++;
            n = n / 10;
            revNumber = (revNumber * 10) + lastDigit;
        }

        System.out.println(revNumber);
    }

}
