import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 행렬의 크기 N(행), M(열) 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 2. 행렬 A의 값을 저장할 2차원 배열 선언
        int[][] matrix = new int[N][M];

        // 3. 행렬 A 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 4. 행렬 B를 입력받으면서 바로 합산하고 결과 문자열 만들기
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()); // B의 각 행을 읽음
            for (int j = 0; j < M; j++) {
                // B의 원소를 읽어서 A의 원소와 더함
                int valueB = Integer.parseInt(st.nextToken());
                int sum = matrix[i][j] + valueB;
                
                sb.append(sum).append(" ");
            }
            sb.append("\n"); // 한 행이 끝나면 줄바꿈
        }

        // 5. 전체 결과 출력
        System.out.println(sb);
    }
}