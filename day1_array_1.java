import java.lang.reflect.Array;
import java.util.Scanner;

public class day1_array_1 {
    /**
     * 날짜 : 2020.12.29
     * 문제 유형 : 배열
     * 문제 url : https://www.acmicpc.net/problem/2167
     * 문제 요약
     *  - 제목 : 2차원 배열의 합
     *  : 2차원 배열이 주어졌을 때 (i,j) 위치부터 (x,y)위치까지 저장되어 있는 수들의 합을 구하여라
     *
     *  : 첫째 줄에는 배열의 크기 N,M
     *  : 다음 N개의 줄에는 M개의 정수로 배열이 주어진다.
     *  : 배열에 포함되어 있는 수는 절대값이 10,000보다 작거나 같은 정수이다.
     *  : 그 다음 줄에는 합을 구할 부분의 개수 K가 주어진다.
     *  : 다음 K개의 줄에는 네 개의 정수로 i,j,x,y가 주어진.(i<=x, j<=y)
     *
     *  부족한 점 : 3중 for문이 사용되고, 메모리도 많이 사용됨 -> DP(동적프로그래밍 사용해야함)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] array = new int[N+1][M+1];
        for (int n = 1; n <= N; n++) {
            for(int m = 1; m <= M; m++){
                array[n][m] = scanner.nextInt();
            }
        }
        int K = scanner.nextInt();
        for(int k = 0; k < K; k++){
            int sum = 0;
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for(int a = i; a <=x; a++){
                for(int b = j; b <= y; b++){
                    sum += array[a][b];
                }
            }
            System.out.println(sum);
        }
    }

    /**
     * [모범 답안]
     * : 작은 문제가 반복되어 일어남 & 같은 문제 구할 때마다 정답이 같음 -> DP(동적프로그래밍) 사용하기
     * : Scanner 대신 BufferedReader, StringTokenizer 사용하기
     *
     *
     * public class Main {
     *  private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     *  public static void main(String args[]) throws IOException {
     *      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     *      StringTokenizer st = new StringTokenizer(br.readLine());
     *      int N = Integer.parseInt(st.nextToken());
     *      int M = Integer.parseInt(st.nextToken());
     *      int dp[][] = new int[N + 1][M + 1];
     *      for (int i = 1; i <= N; i++) {
     *          st = new StringTokenizer(br.readLine());
     *          for (int j = 1; j <= M; j++) {
     *              dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + Integer.parseInt(st.nextToken());
     *          }
     *      }
     *      int T = Integer.parseInt(br.readLine());
     *      for (int i = 0; i < T; i++) {
     *          st = new StringTokenizer(br.readLine());
     *          int x1 = Integer.parseInt(st.nextToken());
     *          int y1 = Integer.parseInt(st.nextToken());
     *          int x2 = Integer.parseInt(st.nextToken());
     *          int y2 = Integer.parseInt(st.nextToken());
     *          bw.write(String.valueOf(dp[x2][y2] + dp[x1 - 1][y1 - 1] - dp[x1 - 1][y2] - dp[x2][y1 - 1]));
     *          bw.write("\n");
     *     }
     *     bw.flush();
     *  }
     * }
     *
     */
}
