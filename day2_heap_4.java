import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class day2_heap_4 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : heap
     * 문제 url : https://www.acmicpc.net/problem/1927
     * 문제 요약
     *  - 제목 :  Kth Largest Element in an Array
     *  : K번째로 큰 원소를 출력해라
     *
     */
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4},2));
    }

    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int a : nums){
            maxHeap.add(a);
        }

        for (int i = 0; i < k-1; i++) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }

}

