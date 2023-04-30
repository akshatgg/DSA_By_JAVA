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
}
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
        System.out.println(temp.value);
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
    public Node append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            Node temp=tail;
            tail.next=newNode;
            newNode.prev=temp;
            newNode=tail;
        }
        length++;
   return tail;
    }
    public Node removelast(){
        if(length==0) {
            return null;
        }    
        Node temp=tail;
    if(length==1){
        head=null;
        tail=null;
    }
    else{
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
    }
    length--;
    return temp;
    }
    public Node prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
        head=newNode;
        tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
        return head;
    }
    public Node removefirst(){
        Node temp=head;
      if(length==0){
        return null;
      }
      else{
      head=head.next;
      temp.next=null;
      head.prev=null;
      }
      length--;
      return temp;
    }
    public Node get(int index){
        
        if(index<0 || index>length){
            return null;
        }
        if(index<length/2)
        {
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    else{
       Node temp=tail;
        for(int i=length-1;i>=0;i--){
         temp=temp.prev;
        }
        return temp;
    }
    }
    public boolean set(int index,int value){
        Node temp=get(index);
         if(temp !=null){
            temp.value=value;
            return true;
         }
return false;
    }
    public boolean insert(int index,int value){
        if(index<0 || index>length){
            return false;
        }
        if(index ==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        else{
           Node newNode=new Node(value);
            Node before=get(index-1);
            Node after=before.next;
            before.next=newNode;
            newNode.prev=before;
            newNode.next=after;
            after.prev=newNode;
            length++;
            return true;
        }

    }
    public Node remove(int index){
      if(index==0){
return removefirst();
    }
    if(index==length-1){
        return removelast();
    }
    else{
        Node temp=get(index-1);
       Node pemp=get(index+1);
       Node remp=get(index);
       temp.next=pemp;
       pemp.prev=temp;
       remp.next=null;
       remp.prev=null;
       length--;
       return remp;
    }


          
    }
}


