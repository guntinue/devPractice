package forProblem;

import java.util.Scanner;

public class For2439 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
