package solved.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sprout27866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        int i = Integer.parseInt(br.readLine());

        if (i >= 0 && i < sArr.length) {
            char foundChar = sArr[i];
            System.out.println(foundChar);
        }

        br.close();
    }
}
//package solved.sprout;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class sprout27866 {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//
//        String S = br.readLine();
//
//
//        int i = Integer.parseInt(br.readLine());
//
//
//        System.out.println(S.charAt(i - 1));
//
//        br.close();
//    }
//}
