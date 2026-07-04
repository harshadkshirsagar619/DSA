package RecursionPractice;

public class SumOfN {

    public static void prints(int i,int n)
    {
        int sum = 0;


        sum=sum+i;
        if (i>n)
        {
            System.out.println(sum);
            return;
        }
        prints(i+1,n);
    }

    public static void main(String[] args) {
        prints(1,5);
    }
}
