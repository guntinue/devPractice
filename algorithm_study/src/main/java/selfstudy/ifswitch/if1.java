package selfstudy.ifswitch;

public class if1 {

    public static void main(String[] args) {

        /*
        * if문은 조건식의 결과에 따라 블록 실행,
        * 조건식에는 true or false 연산식, boolean 타입 변수 작성
        * true = 블록 실행, false = 블록 실행 X
        *
        * 블록 안에 실행해야 할 문장이 한개면 중괄호{} 생략 가능 하지만
        * 코드의 가독성을 고려해 생략하지 않고 작성
        * */

        int score = 93;

        if(score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
    }
}
