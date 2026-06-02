package Recursion;

public class palindrome {

    public static String check(String s,int i)
    {
        if (i >= s.length()/2)
        {
            return "String is Palindrome";

        }

        if (s.charAt(i) != s.charAt(s.length()-i-1))
        {
            return "String is not palindrome";
        }
       return check(s,i+1);

    }

    public static void main(String[] args) {

        String s = "madsm";
        int i=0;
       // int n = s.length();
        System.out.println(check(s,i));
    }
}
