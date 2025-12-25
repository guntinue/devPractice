package solved.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sprout11654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. 한 줄을 읽어온 뒤, 그 줄의 첫 번째 문자(charAt(0))를 가져옵니다.
        char input = br.readLine().charAt(0);

        // 3. char 타입을 int 타입으로 강제 형 변환(Casting)합니다.
        // 자바에서 문자는 내부적으로 아스키/유니코드 숫자로 저장되어 있습니다.
        int asciiValue = (int) input;

        // 4. 아스키 코드 값을 출력합니다.
        System.out.println(asciiValue);

        br.close();
    }
}
