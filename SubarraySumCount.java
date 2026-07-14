package ArratQuestion;

import java.util.Arrays;

public class SubarraySumCount {
    public static void main(String[] args) {
        int[] arr = {1, 2,1,1};
       int ans =  Sum(arr, 3);
        System.out.println(ans);
    }

    public static int Sum(int[] arr, int sum) {

        int count =0;

        for (int i = 0; i < arr.length; i++) {
           // int j = arr[i];
            for (int k = 1 + i; k < arr.length; k++) {
              //  j = j + arr[k];
                if (arr[i] + arr[k] == sum) {
                    //System.out.println(" " + arr[j] + " + " + " " + arr[k] + " == " + " " + sum);
                     count++;
                }

            }
        }
        return count;
    }
}
