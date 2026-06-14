package Pattern;

public class Pattern_p12 {
    public static void main(String[] args) {

        for (int i = 0;i<=5;i++)
        {
            for (int j = 0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for (int k= 0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        Pattern_p12.pattern();
        Pattern_p12.start();
    }

    public static void pattern()
    {

        for (int i = 0;i<=5;i++)
        {
            for (int j = 0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for (int k= 0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            for (int j = 0;j<5-i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println("--------------------------");

        for (int i = 0;i<5;i++)
        {
            for (int j = 0; j < i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*5-(2*i+1); j++)
            {
                System.out.print("*");
            }
            for (int j = 0;j < i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void start()
    {

        System.out.println("---------------------------------------");
        for (int i = 0;i<=5;i++)
        {
            for (int j = 0;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for (int k= 0;k<2*i+1;k++)
            {
                System.out.print("*");
            }
            for (int j = 0;j<=5-i;j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 0;i<5;i++)
        {
            for (int j = 0; j <= i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j< 2*5-(2*i+1); j++)
            {
                System.out.print("*");
            }
            for (int j = 0;j <= i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
