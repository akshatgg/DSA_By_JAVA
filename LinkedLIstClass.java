import javax.lang.model.util.ElementScanner8;

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
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        tail=temp;
        temp.next=newNode;
        tail=newNode;
        Length++;

    }

    public void removelast(){
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
        
        
        System.out.println(temp);
    }
    public void prepend(int value){
        Node newNode=new Node(value);
        newNode.next=head;
        head=newNode;
        Length++;
    }
    public void removefirst(){
        if(Length==0){
            head=null;
            tail=null;
        }
        
        Node temp=head;
        head=head.next;
        temp.next=null;
        if(Length==0){
            tail=null;
        }
        Length--;
        System.out.print(temp);

    }
    public Node get(int index){
     if (index<0 || index>=Length){
        return null;
     }
     Node temp=head;
     for(int i=0;i<index;i++){
     temp=temp.next;
    }
    return temp;
    }
    public boolean set(int index, int value){          
                                                                //  public Node set(int index,int value{
                                                                // if(index>=Length)
                                //   M2  ------                            // {
                                                                //     return null;
                                                                // } 
                                                                // Node temp=head;
                                                                // for(int i=0;i<index;i++){
                                                                //     temp=temp.next;
                                                                // }
                                                                // temp.value=value;
                                                                // return temp;
                                                                // }
        // Node temp=get(index);                         
        // if(temp!=null){
        // temp.value=value;               ------ -M3
        // return true;
        // }
        // return false;
        if(index>=Length){
            return false;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.value=value;
        return true;

    }
    public void remove(int index){
       if(index<0 || index>=Length){
      System.out.println("null");
       }      
       if(index == 0){
          removefirst();
       }
       if(index==Length-1) {
         removelast();
       }
       
       Node pre=get(index-1);
       Node temp=pre.next;
       pre.next=temp.next;
       temp.next=null;
       Length--;
       System.out.println(temp.value);
    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<Length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;

        }
    }
}


