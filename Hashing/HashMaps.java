package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0;i<num.length;i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<5;i++)
        {
            map.put(num[i], map.getOrDefault(num[i],0)+1);
        }
        System.out.println(map);


    }
}
