import java.util.*;
public class DoublyLinkedListClass {
    private Node head;
    private Node tail;
    private int length;       
    class Node{
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value=value;
    }
};
public DoublyLinkedListClass(int value)
{
    Node newNode=new Node(value);
    head=newNode;
    tail=newNode;
    length=1;
    
}    
public void printlist(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp);
        temp=temp.next;
    }
}
    public void gethead(){
        System.out.println("head ="+ head.value);
    }
    public void gettail(){

        System.out.println("tail ="+ tail.value);
    }
    public void getlength(){

        System.out.println("length ="+ length);
    }
    public void space(){
        System.out.println();
    }
}


