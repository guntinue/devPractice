package mathProblem;

import java.util.Scanner;

public class Math10101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int triangle = a + b + c;

        if (triangle != 180) {

            System.out.println("Error");

        } else {

            if (a == 60 && b == 60 && c == 60) {     // 세 각이 모두 60도인 경우

                System.out.println("Equilateral");

            } else if (a == b|| b == c || a == c) {  // 두 각이 같은 경우

                System.out.println("Isosceles");

            } else {                                 //세각이 모두 다르고 합 180도

                System.out.println("Scalene");

            }
        }
    }
}
