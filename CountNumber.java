package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter how many No. to insert in array");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i =0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i< arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);

        System.out.println("Enetr How many number to find : ");
        int n = sc.nextInt();
        while (n >= 1)
        {
            int number = sc.nextInt();
            System.out.println(map.getOrDefault(number,0));
            n--;
        }




    }

}
