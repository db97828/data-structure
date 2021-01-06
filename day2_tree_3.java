
public class day2_tree_3 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 트리
     * 문제 url : https://leetcode.com/problems/maximum-binary-tree/
     * 문제 요약
     *  - 제목 : Maximum Binary Tree
     *  :
     *
     */
    public static void main(String[] args) {
        constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length == 0){
            //빈 배열이면 null 반환
            return null;
        }
        return answer(nums, 0, nums.length-1);
    }

    public static TreeNode answer(int[] nums, int start, int end){
        if(start < 0 || end >= nums.length || start > end){
            //시작 인덱스가 0보다 작거나
            //마지막 인덱스가 배열의 크기보다 크거나
            //시작 인덱스가 마지막 인덱스보다 클 경우
            //null 반환
            return null;
        }

        int max = nums[start];
        int index = start;
        for(int i = start + 1; i <= end; i++){
            if(nums[i] > max){
                //배열 중 가장 큰 수 찾기
                max = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(nums[index]);      //가장 큰 수를 root로 지정
        root.left = answer(nums, start, index - 1); //가장 큰 수 왼쪽
        root.right = answer(nums, index + 1, end);  //가장 큰 수 오른쪽
        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

