import java.io.*;
import java.util.StringTokenizer;

public class day2_tree_2 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 트리
     * 문제 url : https://www.acmicpc.net/problem/9372
     * 문제 요약
     *  - 제목 : 상근이의 여행
     *  : T번 동안 반복한다.
     *  : 첫 번째 줄에는 국가의  N(2<= N <=1000)과 비행의 종류 M(1<=M<=10000)
     *  : 이후 M개의 줄에는 a, b 쌍들이 입력된다. (a와 b를 왕복하는 비행기 존재 의미)
     *  : 주어지는 비행 스케줄은 항상 연결 그래프를 이룬다.
     *  : 상근이가 모든 국가를 여행하기 위해 타야하는 비행기 종류의 최소 개수 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            for (int j = 0; j < M; j++) {
                br.readLine();
            }
            bw.write(N - 1 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
