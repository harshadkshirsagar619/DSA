package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StoreChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        System.out.println("Enetr the number : ");
        int num = sc.nextInt();
        for (int  i = 0;i<num;i++)
        {
            char ch = sc.next().charAt(0);
            arr[ch - 'a']++;
        }

        System.out.println(Arrays.toString(arr));

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0;i< arr.length;i++)
        {

        }


    }
}
