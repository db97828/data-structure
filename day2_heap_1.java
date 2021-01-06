import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class day2_heap_1 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 힙
     * 문제 url : https://programmers.co.kr/learn/courses/30/lessons/42626
     * 문제 요약
     *  - 제목 : 더 맵게
     *  :
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int K = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(s);
        final int num = st.countTokens();
        int array[] = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        count = solution(array, K);
        System.out.println(count);
    }

//    public static int solution(int[] scoville, int K) {
//        // 점수 : 57.1/100
//        int answer = 0;
//        Arrays.sort(scoville);
//        while (scoville[0] <= K){
//            if(scoville.length == 1){
//                return -1;
//            }
//            scoville[0] = scoville[0] + (scoville[1] * 2);
//            scoville[1] = 1000000001;
//            answer++;
//            Arrays.sort(scoville);
//        }
//        return answer;
//    }

    public static int solution(int[] scoville, int K){
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int a : scoville){
            heap.add(a);
        }

        while(heap.peek() <= K){
            if(heap.size() == 1){
                return -1;
            }
            int a = heap.poll();
            int b = heap.poll();

            heap.add(a+(b*2));
            answer++;
        }
        return answer;
    }

}
