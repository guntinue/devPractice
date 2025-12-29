import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] xray = new int[n][m];

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split("");
            xray[i] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        }

        boolean result = false;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < m-1; j++) {
                if(xray[i][j] == 1) {
                    if(xray[i][j+1] == 1) {
                        if(xray[i+1][j] == 1) {
                            if(xray[i+1][j+1] == 1) {
                                System.out.println(1);
                                result = true;
                                break;
                            }
                        }
                    }
                }
            }
            if(result == true) {
                break;
            }
        }
        if(result == false) {
            System.out.println(0);
        }
    }
}

