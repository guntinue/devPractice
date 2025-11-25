package mathProblem;

import java.util.Scanner;

public class Math1271 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 조교가 가진 돈
        int m = sc.nextInt(); // 돈을 받으러 온 생명체의 수

        int result = n / m;
        int remain = n % m;

        System.out.println(result);
        System.out.println(remain);
    }
}
