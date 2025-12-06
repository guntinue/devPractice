import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int minus = a - b;
        int mul = a * b;
        int divide = a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(divide);
        System.out.println(mod);
        


    }
}
