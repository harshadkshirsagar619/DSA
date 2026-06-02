package Recursion;

import java.util.Arrays;

public class ReverNumber {


    public static void rev(int[] arr,int i,int n)
    {
        if (i == n/2)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr,i,n-i-1);
        rev(arr,i+1,n);


    }

    public static void main(String[] args) {

        int[] arr={1,2,3,4,66,44,5};
        int i = 0;
        int n = arr.length;
        rev(arr,i,n);

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
