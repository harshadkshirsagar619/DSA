package RecursionPractice;

public class SumOfNNumbers {

    public static void prints(int i,int sum)
    {
        if (i<1)
        {
            System.out.println(sum);
            return;
        }
        prints(i-1,sum+i);
       }

    public static void main(String[] args) {
        prints(5,0);
    }
}
