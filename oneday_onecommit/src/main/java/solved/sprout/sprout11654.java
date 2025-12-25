package solved.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sprout11654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char n = br.readLine().charAt(0);

        // char 타입을 int 타입으로 강제 형 변환
        int asciiCode = (int) n;

        // 아스키 코드 값 출력
        System.out.println(asciiCode);

        br.close();
    }
}
