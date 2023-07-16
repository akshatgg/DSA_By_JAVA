import java.util.*;


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

public class HIHeightOfBinaryTree {

    
    /*
    class Node 
    int data;
    Node left;
    Node right;
	*/
   class Traverse {
        int count;
        
        Traverse() {
            count = 0;
        }
        
        int getHeight(Node node) {
            if (node == null) {
                return 0;
            }
            if(node.left==null && node.right==null){
                return 0;
            }
            
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);
            
            return Math.max(leftHeight, rightHeight)+1 ;
        }
    }
    
    public static int height(Node root) {
        Traverse tra = new HIHeightOfBinaryTree().new Traverse();
        return tra.getHeight(root);
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
        int height = height(root);
        System.out.println(height);
    }	
}

