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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> l = new ArrayList <> ();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            String s = "[a-z]@gmail.com";
            Pattern p = Pattern.compile(s);
            Matcher m =p.matcher(emailID);
            if(m.find()){
                l.add(firstName);
            }
            
        }
        Collections.sort(l);
            for(String str : l)
                System.out.println(str);

        scanner.close();
    }
}
