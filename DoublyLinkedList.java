
public class DoublyLinkedList {
    public static void main(String[] args){
        DoublyLinkedListClass mydl=new DoublyLinkedListClass(2);
        mydl.getlength();
        mydl.append(3);
        mydl.prepend(1);
        mydl.prepend(0);
        mydl.printlist();
        System.out.println(mydl.get(1).value);
         
    }
}
