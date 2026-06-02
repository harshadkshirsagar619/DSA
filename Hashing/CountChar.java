package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.next();

        // precompute

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);


        int q ;
        q = sc.nextInt();
        while (q-- >= 0)
        {
            char c = sc.next().charAt(0);
            // fetch method

            System.out.println(map.getOrDefault(c,0));
        }

    }
}
