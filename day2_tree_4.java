import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day2_tree_4 {
    /**
     * 날짜 : 2021.01.04
     * 문제 유형 : 트리
     * 문제 url : https://www.acmicpc.net/problem/1991
     * 문제 요약
     *  - 제목 : 트리 순회
     *  : 이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 후위 순회(postorder traversal)
     *  : 결과를 출력하라.
     */

    public void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Tree tree = new Tree();
        int N = Integer.parseInt(bf.readLine());        //노드의 개수
        char[] data;
        for (int i = 0; i < N; i++) {
            data = bf.readLine().replaceAll(" ","").toCharArray();
            tree.add(data[0], data[1], data[2]);
        }
        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);

    }

    class Node{
        public Node left, right;
        public char data;
        public Node(char data){
            this.data = data;
        }
    }

    class Tree{
        Node root;
        public void add(char data, char left, char right){
            if (root == null){
                //빈 tree에 처음 넣을 때
                if(data != '.') root = new Node(data);
                if(left != '.') root.left = new Node(left);
                if(right != '.') root.right = new Node(right);
            }
            else search(root, data, left, right);
        }
        public void search(Node root, char data, char left, char right){
            if(root == null) return;
            else if(root.data == data){
                if(left != '.') root.left = new Node(left);
                if(right != '.') root.right = new Node(right);
            }else{
                search(root.left, data, left, right);
                search(root.right, data, left, right);
            }
        }
        public void preorder(Node root){
            //전위순회(루트->좌->우)
            System.out.print(root.data);
            if(root.left != null) preorder(root.left);
            if(root.right != null) preorder(root.right);
        }
        public void inorder(Node root){
            //중위순회(좌->루트->우)
            if(root.left != null) inorder(root.left);
            System.out.print(root.data);
            if(root.right != null) inorder(root.right);
        }
        public void postorder(Node root){
            //후위순회(좌->우->루트)
            if(root.left != null) postorder(root.left);
            if(root.right != null) postorder(root.right);
            System.out.print(root.data);
        }
    }

}
