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
        List<String> list = new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String regExPattern = "[a-z].@gmail.com";
            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if( m.find()){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for (String string : list) {
            
            System.out.println(string);
            
        }

        scanner.close();
    }
}
