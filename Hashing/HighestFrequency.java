package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no to add ");
        int n = sc.nextInt();


        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );

        }
        System.out.println(map);
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;

        for (Map.Entry<Integer,Integer> entry :map.entrySet())
        {
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq)
            {
                maxFreq = freq;
                maxElement = element;
            }

            if (freq < minFreq)
            {
                minFreq = freq;
                minElement = element;
            }
        }

        System.out.println("Highest frequency : "+maxElement+ " | "+maxFreq);
        System.out.println("Lowest frequency : "+minElement+ " | "+minFreq);


      //  System.out.println(maxFreq);

    }
}
