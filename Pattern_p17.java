package Pattern;

public class Pattern_p17 {
    public static void main(String[] args) {
        for (int i=0;i<5;i++)
        {
            char c = (char) ('E'- i);
            for(int j = 0 ;j <= i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
