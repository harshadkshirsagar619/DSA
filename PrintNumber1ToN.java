package RecursionPractice;

public class PrintNumber1ToN {


    public static void prints(int n,int i)
    {
        if (i>n)
        {
            return;
        }
        System.out.println("i : "+i);
        prints(n,i+1);
    }

    public static void main(String[] args) {
        int n=10;
        int i = 1;
        prints(n,i);
    }
}
