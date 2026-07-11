package ArratQuestion;
public class FindElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(+FindLength(arr,50));
    }
    public static int FindLength(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++) {
            if(target == arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
