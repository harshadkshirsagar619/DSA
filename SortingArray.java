package ArratQuestion;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,1,0,2};
        FindConsicative(arr);
    }

    public static void FindConsicative(int[] arr){
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i =0;i< arr.length;i++)
        {
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1)  {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("0's :" +count0+ "   1's :" +count1 + "   2's :" +count2);

        int[] arr1 = new int[n];

        for(int i = 0;i<count0;i++)
        {
            arr1[i] =0;
        }
        for(int i = count0;i<count0+count1;i++)
        {
            arr1[i] = 1;
        }
        for(int i = count0+count1;i<=count2;i++)
        {
            arr1[i] = 2;
        }
        System.out.println(Arrays.toString(arr1));
    }

}
