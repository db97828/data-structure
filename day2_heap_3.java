import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class day2_heap_3 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : heap
     * 문제 url : https://www.acmicpc.net/problem/1927
     * 문제 요약
     *  - 제목 : 최대힙
     *  : N번동안 반복하며 값을 출력한다.
     *  : 처음에 비어있는 배열에서 시작한다.
     *  : 만약 연산 X가 자연수이면 배열에 X라는 값을 넣는다.
     *  : X가 0이라면 배열에서 가장 값을 출력하고 그 값을 배열에서 제거한다.
     *  : 입력되는 수는 2^31보다 작다.
     *
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(bf.readLine());
            if(x == 0){
                if(maxHeap.size() == 0){
                    System.out.println(0);
                }else{
                    System.out.println(maxHeap.poll());
                }
            }else{
                maxHeap.add(x);
            }
        }
    }
}
