import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] scale = new int[8];
        for (int i = 0; i < 8; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";

        if (scale[0] == 1) {
            
            result = "ascending";
            
            for (int i = 1; i < 8; i++) {
                
                if (scale[i] != i + 1) {
                    
                    result = "mixed";
                    break;
                }
            }
        } else if (scale[0] == 8) {
            
            result = "descending";
            
            for (int i = 1; i < 8; i++) {
                
                if (scale[i] != 8 - i) {
                    
                    result = "mixed";
                    
                    break;
                }
            }
        } else {
            
            result = "mixed";
        }

        System.out.println(result);

        br.close();
    }
}
