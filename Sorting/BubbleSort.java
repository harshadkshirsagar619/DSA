package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {13,23,46,52,9,1};
        int n = 6;
        Sort(arr,n);
        System.out.println(Arrays.toString(arr));


    }
    public static void Sort(int[] arr,int n)
    {
        for (int i = n-1;i>=1;i--)
        {
            for (int j = 0;j<=i-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
