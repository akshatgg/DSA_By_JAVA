import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 class Queue{
     public class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}

public Node first;
public Node last;
public int length;

/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
public void enqueue(int value){
            Node newNode=new Node(value);
            if(length==0){
                first=newNode;
                last=newNode;
                
            }
            else{
                Node temp=last;
                temp.next=newNode;
                last=temp.next;
            }
            length++;
        }
        public void dequeue(){
            
            Node temp=first;
            first=first.next;
            temp.next=null;
            length--;
        }
    }
    public class HISolution {
    public static void main(String[] args) {
        Queue h=new Queue();
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
         for(int i=1;i<=q;i++){
             int c=sc.nextInt();
             switch(c){
                 case 1:
                 int a=sc.nextInt();
                h.enqueue(a); 
                break;
                case 2:
                h.dequeue();
                break;
                case 3:
                
                 System.out.println(h.first.value);
                 break;
                 
             }
         }
}


}
