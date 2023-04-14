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
    public void printlist(){
        Node temp=head; 
        while(temp!=null){
        
            System.out.print(temp.value);
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
}

