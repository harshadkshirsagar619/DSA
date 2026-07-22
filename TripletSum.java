package Arraypractice;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10,45};
        Triplet(arr,22);
    }
    public static void Triplet(int[] arr,int target)
    {
        int res = 0;
       // int start = 0;
        //int end = arr.length-1;
        int n = arr.length;
        for(int i = 0;i< n-2;i++)
        {
            int left  = i+1;
            int right = n-1;

            while (left<right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (target > sum) {
                    left++;
                } else if (target < sum) {
                    right--;
                } else if (target == sum) {
                    System.out.println(sum);
                    return;
                }
            }
        }
        System.out.println(" " +res);
    }
}
