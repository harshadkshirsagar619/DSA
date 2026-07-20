package ArratQuestion;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {1,10,2,1,0,2};
        System.out.println(Max(arr,2));
    }

    public static int Max(int[] arr ,int frequency) {
            int FindElement = FindNumber(arr,frequency);
            int count = 0;
            for(int i = 0;i< arr.length;i++)
            {
                if(FindElement == arr[i])
                    count++;
            }
            return count;

    }

    public static int FindNumber(int[] arr,int frequency)
    {
        for(int i = 0;i< arr.length;i++)
        {
            if(frequency == arr[i]){
                return arr[i];
            }
        }
        return 0;
    }
}
