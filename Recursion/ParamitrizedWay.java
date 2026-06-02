package Recursion;

public class ParamitrizedWay {

    public static void fun(int i,int sum)
    {
        if (i < 1)
        {
            System.out.println(sum);
            return;
        }
        fun(i-1,sum+i);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        fun(n,sum);
    }
}
