package ArratQuestion;

public class FindAvg {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Max(arr));
    }

    public static int Max(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count++;
        }
        int Avg = sum / count;
        return Avg;
    }

}