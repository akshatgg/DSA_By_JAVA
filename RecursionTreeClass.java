import java.util.concurrent.ConcurrentNavigableMap;

public class RecursionTreeClass {
    public Node root;
    private boolean  contains(Node currNode,int value){
        if(currNode==null){
            return false;
        }
        if(currNode.data==value){
            return true;
        }
        if(value<currNode.data){
        return contains(currNode.left, value);
        }
        else{
            return contains(currNode.right, value);
        }

    }
    public Boolean contains(int value){
        return contains(root, value);
    }
    public Node insert(Node currNode,int value){
        if(currNode==null){
           return new Node(value);
        }
      
        if(value<currNode.data){
            currNode.left= insert(currNode.left, value);
        }
        else if(value>currNode.data){
         currNode.right=    insert(currNode.right,value);
        }
        return currNode;
    }
    public Node insert(int value){
        if(root==null)root=new Node(value);
        
        return insert(root,value);

    }
}
