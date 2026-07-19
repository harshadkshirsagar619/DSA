package ArratQuestion;

import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,8,9,};
        Rotate(arr,2);
        //System.out.println(Arrays.toString(ans));
    }
    public static void Rotate(int[] arr,int k)
    {
       // int[] arr1 = new int[5];
        int k1 =0;
        for(int i = 0 ;i<k-1;i++)
        {
            int j = k-1;
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        for(int i = k ;i< arr.length;i++)
        {
            int j = arr.length-1;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));


        for (int m =0;m< arr.length;m++)
        {
            int j = arr.length-1;
                if(m<j) {
                    int temp = arr[m];
                    arr[m] = arr[j];
                    arr[j] = temp;
                    j--;
                }
        }
        System.out.println(Arrays.toString(arr));
    }
}
