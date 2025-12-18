package solved.sprout;

import java.io.*;
import java.util.StringTokenizer;

public class sprout15552 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = a + b;

            bw.write(String.valueOf(sum));

            bw.newLine();

        }
        bw.flush();

        br.close();
        bw.close();
    }
}
