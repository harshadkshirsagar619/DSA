package Recursion;

public class FactorialNumber {

    public static void fact(int i,int fac)
    {
        if (i == 0)
        {
            System.out.println(fac);
            return;
        }
        fact(i-1,fac*i);
    }
    public static void main(String[] args) {
        int n=3;
        int fac = 1;
        fact(n,fac);
    }
}
