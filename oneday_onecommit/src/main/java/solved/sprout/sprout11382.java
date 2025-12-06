package solved.sprout;

import java.math.BigInteger;
import java.util.Scanner;

public class sprout11382 {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();

        BigInteger sum = a.add(b).add(c);
        System.out.println(sum);

    }
}
