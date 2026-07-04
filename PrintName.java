package RecursionPractice;

public class PrintName {

    public static void name(int n,int i)
    {
        if (i>n)
        {
            return;
        }
        System.out.println("Alice");
        name(n,i+1);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        System.out.println("print name...");
        name(n,i);
    }

}
