import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        System.out.println(a + b - c);
        
        String strsum = String.valueOf(a) + String.valueOf(b);
        
        int result2 = Integer.parseInt(strsum) - c;
        
        System.out.println(result2);
    }
}