import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day1_list_1 {
    /**
     * 날짜 : 2020.12.29
     * 문제 유형 : 리스트
     * 문제 url : https://www.acmicpc.net/problem/17827
     * 문제 요약
     *  - 제목 : 달팽이 리스트
     *  : 마지막 N번 노드가 1번을 제외한 임의의 노드를 가리켜 사이클을 이루고, 각 노드당 하나의 정수를 저장하는 연결 리스트이다.
     *  : 첫째 줄에 노드의 개수 N, 질문의 갯수 M, N번 노드가 가리키는 노드의 번호 V가 공백으로 구분되어 주어진다.
     *  : 둘째 줄에는 N개의 정수가 공백으로 주어진다. (이때, Ci는 i번 노드에 저장된 값을 뜻한다.)
     *  : 셋째 줄부터 M개의 줄에 걸쳐 각 질문에 해당하는 K가 주어진다.
     *
     *  : M개의 줄에 걸쳐 1번 노드부터 한 칸씩 총 K번 이동해 도착한 노드에 있는 값을 출력하여라.
     *
     *  : 처리시간이 매우 느림 -> StringBuilder, BufferedReader 사용하기
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //마지막 노드
        int M = sc.nextInt();   //질문의 갯수
        int V = sc.nextInt();   //N번(마지막 노드)가 가리키는 노드 번호
        int[] list = new int[200001];

        for(int n = 0; n < N; n++){
            list[n] = sc.nextInt();
        }

        for(int m = 0; m < M; m++){
            int K = sc.nextInt();   //이동 횟수
                //1번부터 ++1씩 하면서 k번째에 있는 값 출력
                //if N보다 크면 V로 이동 후 남은 숫자 이동 후 값 출력
                // -> 전체에서 v-1을 뺀 수가 반복되는 노드 갯수
                // -> 우선 v-1을 한 후 반복되는 노드 갯수로 나눈 나머지에 처음에 뺀 v-1을 더해준다
            if(K >= N){
                System.out.println(list[(K-(V-1)) % (N-(V-1)) + (V-1)]);
            }else{
                System.out.println(list[K]);
            }
        }
    }
}
