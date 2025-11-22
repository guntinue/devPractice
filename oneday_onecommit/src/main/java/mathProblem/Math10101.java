package mathProblem;

import java.util.Scanner;

public class Math10101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int triangle = a + b + c;

        if (triangle == 180) {
            if(a == b) {
                if(b == c) {
                    System.out.println("Equilateral");
                } else {
                    System.out.println("Isosceles");
                }
            } else if(a != b) {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("error");
        }
    }
}
