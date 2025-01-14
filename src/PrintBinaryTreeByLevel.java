import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int key) {
        data = key;
        left = null;
        right = null;
    }
}

public class PrintBinaryTreeByLevel {

    public static void printLevelOrder(Node root){
        if(root == null){
            System.out.println("tree is empty");
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();

        q1.add(root);

        while(!q1.isEmpty() || !q2.isEmpty()){

            while(!q1.isEmpty()){
                root = q1.peek();
                System.out.print(root.data+ " ");
                q1.poll();
                if(root.left != null){
                    q2.add(root.left);
                }
                if (root.right != null) {
                    q2.add(root.right);
                }

            }
            System.out.println();

            while(!q2.isEmpty()){
                root = q2.peek();
                System.out.print(root.data + " ");
                q2.poll();
                if (root.left != null) {
                    q1.add(root.left);
                }
                if (root.right != null) {
                    q1.add(root.right);
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        printLevelOrder(root);
}
}
