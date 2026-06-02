package Recursion;

public class FunctionalWay {

    public static int  Num(int n)
    {
        if (n == 0 )
        {
            return 0;
        }
        return n + Num(n-1);
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(Num(n));

    }
}
