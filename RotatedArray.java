package Assignment;

public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = search(arr,3);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if(target == arr[pivot])
        {
            return pivot;
        } else if (target > arr[0]) {
            return binarySearch(arr,target,0,pivot-1,true);
        }else if(target < arr[0]){
            return binarySearch(arr,target,pivot+1, arr.length-1, false);
        }
        return -1;
    }
    public static int binarySearch(int[] arr,int target,int start,int end,boolean findNum)
    {
        int ans = -1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid] ){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                ans = mid;
                if(findNum == true)
                {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end)
        {
            int mid = start + (end - start ) / 2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            } else if (arr[start] < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
