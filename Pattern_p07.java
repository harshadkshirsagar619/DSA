package Pattern;

public class Pattern_p07 {
    public static void main(String[] args) {

        Pattern_p07.pattern();
    }
    public static void pattern()
    {
        for (int i = 0;i < 5;i++) {

            for (int j = 0;j<5-i-1;j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int k = 1; k < 5 - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }


}
