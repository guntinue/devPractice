package mathProblem;

import java.math.BigInteger;
import java.util.Scanner;

public class Math1271 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger(); // 조교가 가진 돈
        BigInteger m = sc.nextBigInteger(); // 돈을 받으러 온 생명체의 수

        BigInteger result = n.divide(m);
        BigInteger remain = n.remainder(m);

        System.out.println(result);
        System.out.println(remain);
    }
}
