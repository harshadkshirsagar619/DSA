package ArratQuestion;

import java.util.Arrays;

public class TraverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] A = TarverseArray(arr);
        System.out.println(Arrays.toString(A));
    }
    public static int[] TarverseArray(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-1 ; i >=0;i--)
        {
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
}
