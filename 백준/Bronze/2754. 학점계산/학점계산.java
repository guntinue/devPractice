import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade = br.readLine();

        if (grade.equals("F")) {
            System.out.println("0.0");
            return;
        }

        double score = 0.0;

        char first = grade.charAt(0);
        if (first == 'A') {
            score = 4.0;
        } else if (first == 'B') {
            score = 3.0;
        } else if (first == 'C') {
            score = 2.0;
        } else if (first == 'D') {
            score = 1.0;
        }
        
        char second = grade.charAt(1);
        if (second == '+') {
            score += 0.3;
        } else if (second == '-') {
            score -= 0.3;
        }
        System.out.println(score);

    }
    
}