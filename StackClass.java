public class StackClass {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
    }
    public int Stack(int value){
Node newNode=new Node(value);
top=newNode;
height=1;
return height;
    }
public void printlist(){
    Node temp=top;
    while(temp!=null){
        System.out.println(temp.value);
        temp=temp.next;
    }
}
public void height(){
    System.out.println(height);
}
public void push(int value){
    Node newNode=new Node(value);

    Node temp=top;
    if(height==0){
        top=newNode;
        height=1;
    }
    else{
        temp.prev=newNode; 
                            //  M2   //  newNode.next=top
                                    //   top=newNode;
        
        newNode.next=top;
        top=temp.prev;           
        top.next=temp;
    }
    height++; 
}
public Node pop(){
    if(height==0){
    top=null;
    }
    else{
        Node temp=top;
                top=top.next;
                temp.next=null;
    }
    height--;
    return top;
}
}
