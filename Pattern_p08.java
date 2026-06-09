package Pattern;

public class Pattern_p08 {
    public static void main(String[] args) {
        Pattern_p08.pattern();
    }
    public static void pattern()
    {

        for (int i = 0 ; i < 5; i++)
        {

            for (int j = 0;j < i;j++)
            {
                System.out.print(" ");
            }
            for (int j = 0;j< 2*5-(2*i+1);j++)
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
}
