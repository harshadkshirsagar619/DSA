package Recursion;

public class FunctionalFact {


    public static int Fact(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        return i * Fact(i - 1);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Fact(n));
    }
}
