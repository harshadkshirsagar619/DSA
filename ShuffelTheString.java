package StringProject;

public class ShuffelTheString {
    public static void main(String[] args) {
        int [] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s,indices));

    }

    public  static  String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        //StringBuilder builder = new StringBuilder();
        for(int i = 0; i< indices.length;i++)
        {
            ans[indices[i]] = s.charAt(i);
        }
        return new String(ans);
    }

}
