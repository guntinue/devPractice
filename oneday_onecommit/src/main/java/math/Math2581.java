package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Math2581 { // ???? 전혀 모르겠음

    public static boolean  isPrime(int num){
        for(int i=2;i<(int)Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();      // 소수 담을 리스트
        int result = -1;
        int sum = 0;
        int minNum = Integer.MIN_VALUE;     // 결과값 중 최소값

        for(int num : numbers){
            if(isPrime(num)){
                numbers.add(num);
                sum += num;
                if (num < minNum) {
                    minNum = num;
                }
            } else {
                System.out.println(result);
            }
        }
        System.out.println(sum);
        System.out.println(minNum);

    }
}
