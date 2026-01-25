import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] baskets = new int[N + 1];
        
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()); // 시작 바구니
            int j = Integer.parseInt(st.nextToken()); // 끝 바구니
            int k = Integer.parseInt(st.nextToken()); // 공 번호
            
            for (int index = i; index <= j; index++) {
                baskets[index] = k;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(baskets[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}