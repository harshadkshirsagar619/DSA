package ArratQuestion;

import java.util.Arrays;

public class SumAllArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] a = runningSum(nums);
        System.out.println(Arrays.toString(a));
    }
    public static int[] runningSum(int[] nums) {

       // int j =1;
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i =1;i<nums.length;i++)
        {
           // int sum = 0;
             ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
