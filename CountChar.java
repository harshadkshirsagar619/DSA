package Hashing;

import java.util.*;

public class CountChar {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enetr the how many char to enter : ");
        int num = sc.nextInt();
        char[] c = new char[num];

        System.out.println("Enter the LowerCase Char : ");
        for (int i = 0;i<c.length;i++)
        {
            c[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(c));

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<c.length;i++)
        {
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        System.out.println(map);




    }
}
