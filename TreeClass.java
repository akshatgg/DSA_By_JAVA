public class TreeClass {
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
  public  TreeClass(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
        }
    length=1;
    
    }
    public boolean insert(int data){
        Node newNode=new Node( data);
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
}
                //         47
                //       21   76
                //    18   27  52  82 