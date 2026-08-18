package Sorting;

import java.util.Arrays;

public class Insertion {

    static int[] insertion(int arr[])
    {
        int n = arr.length;;
        for(int i = 1;i<n;i++)
        {
            int curr = i;
            int prev = i-1;
            int currValue = arr[i];

            while(prev >= 0 && currValue  < arr[prev])
            {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = currValue;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {5,3,2,6,1};
        System.out.println(Arrays.toString(insertion(arr)));
    }
}
