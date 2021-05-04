import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String str; 
        for(int i=0;i<n;i++)
        {
            str=s.nextLine();
            char ch[]=str.toCharArray();
            for(int j=0;j<str.length();j++)
            {
                if(j==0 || j%2==0)
                {
                    System.out.print(ch[j]);
                }
            }
            System.out.print(" ");
            for(int j=0;j<str.length();j++)
            {
                if(j%2!=0)
                {
                    System.out.print(ch[j]);
                }
            }
            System.out.print("\n");
        }
    }
}