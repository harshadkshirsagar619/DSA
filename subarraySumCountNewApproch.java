package ArratQuestion;

public class subarraySumCountNewApproch {
    public static void main(String[] args) {
        int[] arr = {1, 2,1,1};
        Sum(arr, 3);
        //System.out.println(ans);
    }

    public static void Sum(int[] arr, int sum) {
        int count = 0;
        int j = 0;
        int i =1;
        while (i < arr.length){
            if(arr[j] + arr[i] == sum){
                j++;
                i++;
                count++;
            }else {
                i++;
            }
        }
        System.out.println(count);
    }
}
