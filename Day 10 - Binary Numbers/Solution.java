import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int no=n;
        int r=0,i=0,maxc=0,c=0;
        int a [] = new int [100];
        while(n!=0)
        {
            r=n%2;
            if(r==1)
            {
                c++;
                if(c>maxc)
                {
                    maxc=c;
                }
            }
            else
            c=0;
            n=n/2;
            i++;  
        }
        System.out.println(maxc);
        scanner.close();
    }
}