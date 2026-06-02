package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void Sort(int[] arr,int n)
    {
        for (int i = 0;i<= n-1;i++)
        {
            int j=i;
            while (j>0 && arr[j-1] > arr[j])
            {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13,23,46,52,9,1};
        int n = 6;
        Sort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
