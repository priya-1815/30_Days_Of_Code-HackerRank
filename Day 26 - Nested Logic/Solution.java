import java.io.*;
import java.util.*;

public class Solution {
    static int fine(int dr, int mr, int yr, int dd, int md, int yd){
        int f=0;
        if(yr > yd)
            f=10000;
        if(mr>md && yr==yd)    
            f=500*(mr-md);
        if(dr>dd && mr==md && yr==yd)
            f=15*(dr-dd);
            return f;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int dr = s.nextInt();
        int mr = s.nextInt();
        int yr = s.nextInt();
        int dd = s.nextInt();
        int md = s.nextInt();
        int yd = s.nextInt();
        System.out.println(fine(dr,mr,yr,dd,md,yd));
    }
}
