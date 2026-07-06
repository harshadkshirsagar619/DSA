package RecursionPractice;

public class PalindromString {

    public static void palindrome(int i,int n,String name)
    {
        if (i>=n/2)
        {
            System.out.println("String is Palindeome");
            return;
        }
        if (name.charAt(i) != name.charAt(n-i-1))
        {
            System.out.println("String is not palindrome");
            return;
        }
        palindrome(i+1,n,name);
    }

    public static void main(String[] args) {
        String name="mm";
        palindrome(0,name.length(),name);
    }
}
