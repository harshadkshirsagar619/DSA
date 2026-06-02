package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the values : ");
        for (int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        // precompute
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);


        System.out.println("enter the value of query");
        int q = sc.nextInt();

        while (q > 0)
        {

            int number = sc.nextInt();
            //System.out.println(number);
            // fetch method

            System.out.println(map.getOrDefault(number,0));
        }
    }
}
