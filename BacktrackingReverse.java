package RecursionPractice;

public class BacktrackingReverse {

    public static void prints(int n,int i)
    {
        if (i<1)
        {
            return;
        }
        prints(n,i-1);
        System.out.print(" "+i);
    }

    public static void main(String[] args) {
        prints(5,5);
    }
}
