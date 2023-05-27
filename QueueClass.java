public class QueueClass{
    private Node first;
    private Node last;
    private int length;
    
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public QueueClass(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
}
public void printqueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
}
public void getlength(){
System.out.println(length);
}
public void enqueue(int value){
    Node newNode=new Node(value);
    if(length==0){
        first = newNode;
        last = newNode;
}
else{
    Node temp = last;
    temp.next=newNode;
    last=temp.next;
}
length++;
}
public void dequeue(){
  if(length==0){
    System.out.println("Queue is empty");
}
else{
    Node temp=first;
    first=first.next;
    temp.next=null;
}
length--;
}
}