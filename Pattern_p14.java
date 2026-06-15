package Pattern;

public class Pattern_p14 {
    public static void main(String[] args) {

        for (int i = 65 ;i<=69;i++)
        {
            for (char c = 65;c <= i;c++)
            {
                System.out.print(c);
            }
            System.out.println();
        }

        for (int i =0;i<5;i++)
        {
            for (char ch = 'A';ch <= 'A'+i ; ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
