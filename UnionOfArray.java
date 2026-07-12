package ArratQuestion;

import java.util.Arrays;

public class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        Union(arr1,arr2);

    }
    public static void Union(int[] arr1,int[] arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        int[] arr = new int[6];
        int i =0, j=0;
        int k = 0;

        while (i < n && j < n){
            if(arr1[i] == arr2[j]){
                arr[k] = arr1[i];
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] > arr[j]) {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (j < m){
            arr[k] = arr2[j];
            j++;
            k++;
        }
        while (i<n){
            arr[k] = arr1[i];
            i++;
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
