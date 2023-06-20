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

public class HIPostOrder {


/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/
              
    public static void postOrder(Node root) {
    if(root==null){
        return;
    }
    
    
    Stack<Node> s=new Stack<>();
        Stack<Node> s2=new Stack<>();

        s.push(root);
    while(!s.isEmpty()){
        Node current=s.pop();
        s2.push(current);
        // System.out.print(current.data+" ");
        if(current.left!=null){
            s.push(current.left);
        }
        if(current.right!=null){
            s.push(current.right);
        }
    }
  
    while(!s2.isEmpty()){
        Node se=s2.pop();
        System.out.print(se.data+" ");
    }
    }

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
        postOrder(root);
    }
}

