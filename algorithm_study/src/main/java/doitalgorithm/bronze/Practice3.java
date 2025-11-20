package doitalgorithm.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Practice3 {

    // 자료구조 / P11659_구간합구하기.java

    /* suNo(숫자 개수), quizNo(질의 개수) 저장하기
    * for(숫자 개수만큼 반복하기) {
    *   합 배열 생성하기(S[i] = S[i - 1] + A[i])
    * }
    * for(질의 개수만큼 반복하기) {
    *   질의 범위 받기(i ~ j)
    *   구간 합 출력하기(S[j] - S[i - 1])
    * }
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =
                new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        long[] S = new long[suNo + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }

    }
}
