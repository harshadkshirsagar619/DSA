package RecursionPractice;

public class ParametrizedFactorials {

    public static void fact(int i,int sum)
    {
        if (i<1)
        {
            System.out.println(sum);
            return;
        }
        fact(i-1,sum*i);
    }

    public static void main(String[] args) {
        fact(5,1);
    }
}
