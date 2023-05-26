public class StackClass {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;
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
}
