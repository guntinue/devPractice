package doitalgorithm.bronze;

import java.util.Scanner;

public class Practice1 {

    // 자료구조 / P11720_숫자의합.java

    /* N값 입력받기
    * 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장
    * sNum을 다시 char []형 변수 cNum에 변환하여 저장하기
    * int형 변수 sum 선언
    * for(cNum 길이만큼 반복)
    * {
    *   배열의 각 자릿값을 정수형으로 변환하며 sum에 더하여 누적하기
    * }
    * sum 출력
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N의 값 : ");
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;
        for(int i = 0; i < cNum.length; i++){
            sum += cNum[i] - '0'; // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        System.out.println(sum);
    }
}
