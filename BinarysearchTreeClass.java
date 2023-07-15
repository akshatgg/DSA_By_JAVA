import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarysearchTreeClass {
    public Node root;
    public int length;
    class Node{
        int data;
        Node left;  
        Node right;
        Node(int data){
            this.data=data;
        }
    }
//   BinarysearchTreeClass(int data){
//         Node newNode=new Node(data);
//         if(root==null){
//          root=newNode;
//         }
//     length=1;
//     }
    public boolean insert(int data){
        Node newNode=new Node(data);
        if(root==null){
        root=newNode;
    return true;    
    }
    Node temp=root;
    if(newNode.data==root.data){
    return false;
    }
    while(true){
    if(newNode.data>temp.data){
        if(temp.right==null){
        temp.right=newNode;
        return true;
    }
    temp=temp.right;
    }
    
    else{
        
        if(temp.left==null){
        temp.left=newNode;
        return true;
    }
    temp=temp.left;
    }

    }
    
    }
    public boolean contains(int data){
     Node temp=root;
     while(temp!=null){
    if(temp.data>data){
        temp=temp.left;
    } 
    else if(temp.data<data){
        temp=temp.right;
    }
    else{
        return true;
    }
    }
    return false;
}
public ArrayList<Integer> BST(){
  Node currnode=root;
  Queue<Node> queue=new LinkedList<>();
  ArrayList<Integer> array=new ArrayList<>();
    if (currnode == null) {
            return array;
        }
  queue.add(currnode);
  while(!queue.isEmpty()){
    currnode=queue.remove();
    array.add(currnode.data);
    if(currnode.left!=null){
      queue.add(currnode.left);
    }
    if(currnode.right!=null){
      queue.add(currnode.right);
    }
  }
  return array;

  }

}
