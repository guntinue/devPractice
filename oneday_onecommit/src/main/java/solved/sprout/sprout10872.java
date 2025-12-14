package solved.sprout;

import java.util.Scanner;

public class sprout10872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 1;

        for (int i = 1; i <= N; i++) {

            ans = ans * i;

        }

        System.out.println(ans);
    }
}
