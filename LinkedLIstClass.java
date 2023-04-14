public class LinkedLIstClass {
    private Node head;
    private Node tail;
    private int Length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    LinkedLIstClass (int value){
        Node newNode=new Node(value);
    head=newNode;
    tail=newNode;
    Length=1;
    }
    
}
