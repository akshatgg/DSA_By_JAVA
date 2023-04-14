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
        Node newNode=new  Node(value);
        // Node newNode2=new  Node(value1);
    head=newNode;
    tail=newNode;
    Length=1;
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

        System.out.println("length ="+ Length);
    }
    public void space(){
        System.out.println();
    }
    public void append(int value){
        Node newNode2=new Node(value);
        if (Length==0){
head=newNode2;
tail=newNode2;
        }
        else{
            tail.next=newNode2;
            tail=newNode2;
        }
        Length++;
    }
    public void append2(int value1){
        Node newNode=new Node(value1);
        if(Length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        Length++;

    }

    public void remove(){
        Node temp=head;
        Node pre=head;
        if(Length==0){
         head=null;
         tail=null;
        }
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        Length--;
        if(Length==0){
            head=null;
            tail=null;
        }
        
        
        System.out.print(temp);
    }
}

