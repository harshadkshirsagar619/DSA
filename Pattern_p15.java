package Pattern;

public class Pattern_p15 {
    public static void main(String[] args) {

        for (int i = 0;i<=5;i++)
        {
            char a = (char) ('A' + i);
            for (char j = 0;j <= i;j++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
