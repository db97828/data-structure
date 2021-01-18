import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day3_backtracking_1 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 백트래킹
     * 문제 url : https://www.acmicpc.net/problem/15649
     * 문제 요약
     *  - 제목 : N과 M (1)
     *
     *  : 1. 완점탐색(dfs + 백트래킹)으로 풀어야 한다.
     *  : 2. 방문처리를 통해 자기자신을 제외한 값들을 불러온다.
     *  : 3. M개 까지 탐색을 마치면 값들을 출력하고 백트래킹을 통해 미방문 처리를 한다.
     *
     */

    public static int N,M;
    public static int[] nums;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        visited = new boolean[N];

        backtracking(0);
    }

    static void backtracking(int num){
        if(num == M){
            for (int i = 0; i < M; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }else{
            for (int i = 1; i <= N; i++) {
                if(!visited[i-1]){
                    visited[i-1] = true;        //
                    nums[num] = i;
                    //하나씩 값을 올려가면서 못 찾은 값 찾기
                    backtracking(num+1);
                    //초기화 시켜서 다음 출력을 준비
                    visited[i-1] = false;
                }
            }
        }
    }
}
