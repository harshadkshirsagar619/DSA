package Pattern;

public class Pattern_p18 {
    public static void main(String[] args) {

        int space = 0;
        for (int i = 0;i < 5 ;i++)
        {

            for (int j = 0; j< 5-i;j++)
            {
                System.out.print("*");
            }

            for (int j = 0;j<space;j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j< 5-i;j++)
            {
                System.out.print("*");
            }

            space +=2;
            System.out.println();
        }

        int start = 7;
        for (int i = 0;i< 5;i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            for (int j = 0;j <= start;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            start-=2;
        }
    }
}
