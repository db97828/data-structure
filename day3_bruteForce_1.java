import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day3_bruteForce_1 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 완전탐색
     * 문제 url : https://www.acmicpc.net/problem/1476
     * 문제 요약
     *  - 제목 : 날짜계산
     *  :
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int year = 0;

        do {
            year++;
        } while ((year - E) % 15 != 0 || (year - S) % 28 != 0 || (year - M) % 19 != 0);
        System.out.println(year);
    }
}
