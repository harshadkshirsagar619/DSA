package ArratQuestion;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0,2};
        Sort(arr);
    }
    public static void Sort(int[] arr)
    {
        int l = 0,m=0;
        int h = arr.length-1;
        while (m <= h)
        {
            if(arr[m] == 0){
                int temp = arr[l];
                arr[l] = arr[m];
                arr[m] = temp;
                l++;
                m++;
            } else if (arr[m] == 2) {
                int temp = arr[h];
                arr[h] = arr[m];
                arr[m] = temp;
                h--;
            }else {
                m++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
