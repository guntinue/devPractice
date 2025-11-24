import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int xMax = -10001;
        int yMax = -10001;
        int xMin = 10001;
        int yMin = 10001;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            xMax = Math.max(xMax, x);
            yMax = Math.max(yMax, y);
            xMin = Math.min(xMin, x);
            yMin = Math.min(yMin, y);
        }
        int area = (xMax - xMin) * (yMax - yMin);

        System.out.println(area);
    }
}