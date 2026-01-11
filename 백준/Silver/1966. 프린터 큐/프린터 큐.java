import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            ArrayDeque<int[]> info = new ArrayDeque<>();       // {인덱스, 중요도}

            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());     // 우선순위 덱

            st = new StringTokenizer(br.readLine());
            for (int index = 0; index < n; index++) {
                int queues = Integer.parseInt(st.nextToken());

                info.offer(new int[]{index, queues});
                queue.offer(queues);
            }

            int count = 0;    // 인쇄된 수

            while(!info.isEmpty()) {
                int[] current = info.poll();
                int index = current[0];
                int queues = current[1];

                if(queues == queue.peek()) {
                    count++;        // 인쇄 됨
                    queue.poll();   // 목록에서 빼기

                    if(index == m) {
                        sb.append(count).append("\n");
                        break;
                    }
                } else {

                    info.offer(current);   // 목록 뒤로 이동

                }
            }
        }
        System.out.println(sb);
    }
}
