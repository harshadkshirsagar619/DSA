package Pattern;

public class Pattern_p16 {
    public static void main(String[] args) {

        for (int i = 0 ; i < 5; i++)
        {
            for (int j = 0;j < 5-i-1;j++)
            {
                System.out.print(" ");
            }

            // char
            char ch = 'A';
            int brealpoint = (2*i+1)/2;
            for (int j = 1 ; j<=2*i+1 ; j++)
            {
                System.out.print(ch);
                ch++;
                if (j <= brealpoint)
                {
                    ch++;
                }else {
                    ch--;
                }
            }


            for (int j = 0;j< 5-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
