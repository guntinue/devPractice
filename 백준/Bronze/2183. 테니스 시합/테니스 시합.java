import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String s = st.nextToken();

        int[] setWins = new int[n];   // 세트 스코어
        int[] gameWins = new int[n];  // 현재 세트의 게임 스코어
        int[] points = new int[n];    // 현재 게임의 포인트 

        for (int i = 0; i < s.length(); i++) {
            int p = s.charAt(i) - 'A'; // 이번 턴을 이긴 선수

            boolean gameFinished = false;

            if (points[p] == 3) {
                boolean isWin = true;
                for (int other = 0; other < n; other++) {
                    if (p == other) continue;
                    if (points[other] > 2) {
                        isWin = false;
                        break;
                    }
                }
                if (isWin) gameFinished = true;
            }
                
            
            if (!gameFinished && points[p] == 4) {
                gameFinished = true;
            }

            if (gameFinished) {
            } else {
                boolean isAdvantageBroken = false;
                for (int other = 0; other < n; other++) {
                    if (p == other) continue;
                    if (points[other] == 4) {
                        points[other]--;
                        isAdvantageBroken = true;
                        break;
                    }
                }

                if (!isAdvantageBroken) {
                    points[p]++;
                }
                
                continue; // 다음 세트 진행
            }

            gameWins[p]++;      // 게임 승수 증가
            Arrays.fill(points, 0); // 포인트 초기화 

            if (gameWins[p] >= 6) {
                boolean isSetOver = true;
                for (int other = 0; other < n; other++) {
                    if (p == other) continue;
                    if (gameWins[p] - gameWins[other] < 2) {
                        isSetOver = false;
                        break;
                    }
                }

                if (isSetOver) {
                    boolean isPerfect = true;
                    for (int other = 0; other < n; other++) {
                        if (p == other) continue;
                        if (gameWins[other] > 0) {
                            isPerfect = false;
                            break;
                        }
                    }

                    if (isPerfect) setWins[p] += 2;
                    else setWins[p] += 1;

                    Arrays.fill(gameWins, 0); // 게임 스코어 초기화

                    if (setWins[p] >= 3) {
                        System.out.println((char) (p + 'A'));
                        return;
                    }
                }
            }
        }
    }
}