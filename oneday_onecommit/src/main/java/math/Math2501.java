package math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Math2501 {

    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int count = 0; // 약수 개수
            int result = 0; // k번째 약수

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;

                    if (count == k) {// 현재 약수의 순서(count)가 k와 같다면
                        result = i;  // i가 k번째 약수이므로 저장
                        break;
                    }
                }
            }
            System.out.println(result); // k번째 약수가 존재하지 않아 result가 0인 채로 남아있다면 0을 출력.
    }
}
