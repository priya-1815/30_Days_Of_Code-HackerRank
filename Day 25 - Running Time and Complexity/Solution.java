import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution {
    static String isPrime(int n){
        int flag=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                flag=1;            
        }
        if(flag==1 || n==1)
            return "Not prime";
        else
            return "Prime";    
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        int n;
        while(t>0)
        {
            n=s.nextInt();
            String result=isPrime(n); 
            System.out.println(result);
            t--;
        }
    }
}
