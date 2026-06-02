package Recursion;

public class FibonacciNumber {


    public static int number(int n)
    {
        if (n <= 1)
        {
            return n;
        }

        int last = number(n-1);
        int sLast = number(n-2);
        return last + sLast;
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(number(n));
    }
}
