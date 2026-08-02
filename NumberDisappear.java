package SortingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisappear {
    public static void main(String[] args) {
        int[]  arr = {4,3,2,7,8,2,3,1};
        number(arr);
        System.out.println(Arrays.toString(arr));
        List ans = number(arr);
        System.out.println(ans);

    }
    public static List<Integer> number(int[] arr)
    {

        int i = 0;
        while(i< arr.length)
        {
           int index = arr[i] - 1;
           if(arr[i] != arr[index] )
           {
               swap(arr,i,index);
           }else{
               i++;
           }
        }

      /*  for(int j = 0; j< arr.length;j++){
            int sum = j + 1;
            if(arr[j] != sum){
                ans = sum ;
            }
        }
        return ans;  */
        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j< arr.length;j++)
        {
            int sum = j + 1;
            if(arr[j] != sum){
                ans.add(sum);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first ,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
