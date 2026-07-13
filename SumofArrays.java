package ArratQuestion;

public class SumofArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println("Arrays sum : "+Findsum(arr));
        System.out.println("Arrays sum Alternative: "+FindAlternative(arr));
    }
    public static int Findsum(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        return sum;
    }


    // sum of alternative numbers

    public static int FindAlternative(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
