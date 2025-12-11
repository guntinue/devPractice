package solved.sprout;

import java.math.BigInteger;
import java.util.Scanner;

public class sprout2420 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();

            sc.close();


            long difference = Math.abs((long)N - M);


            System.out.println(difference);
        }
    }


