package RecursionPractice;

import java.util.Arrays;

public class ReverseArrayWithOneVariable {

    public static void rev(int i,int n,int[] arr)
    {
        if (i>=n/2)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }

        swap(i,n-i-1,arr);
        rev(i+1,n,arr);

    }

    public static void swap(int l,int r,int[] arr)
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {

        int[] arr ={1,4,3,5,6};
        int n= arr.length;
        rev(0,n,arr);
    }
}
