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
    // public Node delete(Node currNode,int value){
    //     if(currNode.data==value){
    //     return null;
    //     }
    //     if(value<currNode.data){
    //         currNode.left=delete(currNode.left,value);
    //     }
    //     else if(value>currNode.data){
    //         currNode.right=delete(currNode.right,value);
    //     }
    //     return currNode;

    // }
    // public Node delete(int value){
    //     return delete(root,value);
    // }
    public int minvalue(Node currNode){
        while(currNode.left!=null){
            currNode=currNode.left;
        }
        return currNode.data;
    }
public Node delete(Node currNode,int value){
    if(currNode==null){
        return null;
    }
    if(value<currNode.data){
    currNode.right=delete(currNode.right,value);
    }
    else if(value>currNode.data){
        currNode.left=delete(currNode.left,value);
    }
    else{
        if(currNode.left==null && currNode.right==null){
            currNode=null;
        }
       else if(currNode.left==null){
            currNode=currNode.right;
        }
        else if(currNode.right==null){
            currNode=currNode.left;
        }
        else {
            int subtreemin=minvalue(currNode.right);
            currNode.data=subtreemin;
            currNode.right=delete(currNode.right,subtreemin);
        }
    }
    return currNode;
}
}
