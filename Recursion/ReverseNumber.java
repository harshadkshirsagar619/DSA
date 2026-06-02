package Recursion;

import java.util.Arrays;

public class ReverseNumber {

    public static void rev(int[] arr,int start,int end)
    {

        if (start >= end)
        {
           /* for (int num:arr)
            {
                System.out.print(num+" ");
            }

            */
            System.out.println(Arrays.toString(arr));
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rev(arr,start+1,end-1);

    }

    public static void main(String[] args) {


        int[] arr= {1,2,3,4,5};
        int start = 0;
        int end = arr.length - 1;

        rev(arr,start,end);
    }
}
