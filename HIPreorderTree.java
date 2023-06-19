import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class HIPreorderTree {


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {
        if(root==null){
            return;
        }
 Stack<Node> s =new Stack<>();
 Node temp=root;
 s.push(temp);
 while(!s.isEmpty()){
     Node pope=s.pop();
     System.out.print(pope.data+" ");
      if(pope.right!=null){
         s.push(pope.right);
     }
     if(pope.left!=null){
         s.push(pope.left);
     }
 }
    }
// public static void preOrder(Node root) {
//     if (root == null) {
//         return;
//     }
//     Stack<Node> stack = new Stack<>();
//     stack.push(root);
//     while (!stack.isEmpty()) {
//         Node current = stack.pop();
//         System.out.print(current.data + " ");
//         if (current.right != null) {
//             stack.push(current.right);
//         }
//         if (current.left != null) {
//             stack.push(current.left);
//         }
//     }
// }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }	
}

