package Recursion;

public class PrintName {

    public static void Name(int i)
    {
        if (1 > i)
        {
            return;
        }
        System.out.println("alice");
        Name(i-1);
    }

    public static void main(String[] args) {
        int i = 5;
        Name(i);
    }
}
