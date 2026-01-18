import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            String line = br.readLine();
            if(line == null) {
                break;
            }

            StringTokenizer st = new StringTokenizer(line);
            if(!st.hasMoreTokens()) {
                break;
            }

            int a = Integer.parseInt(st.nextToken());

            if(a == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            int b = -1;
            
            for(int i = 0; i < a; i++) {
                int current = Integer.parseInt(st.nextToken());
                
                if(current != b) {
                    sb.append(current).append(" ");
                    b = current;
                }
            }
            
            sb.append("$");

            System.out.println(sb.toString());
        }
    }
}
