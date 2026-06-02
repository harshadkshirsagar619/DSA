package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void Sort(int[] arr,int n)
    {
        for (int i=0;i<=n-2;i++)
        {
            int min = i;
            for (int j = i;j<=n-1;j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {13,23,46,52,9,1};
        int n = 6;
        Sort(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
