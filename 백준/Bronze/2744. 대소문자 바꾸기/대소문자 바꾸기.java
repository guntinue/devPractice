import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                
                sb.append(Character.toLowerCase(c));
                
            } else if (Character.isLowerCase(c)) {

                sb.append(Character.toUpperCase(c));
                
            }
        }

        System.out.println(sb.toString());

        br.close();
    }
}
