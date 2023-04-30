
public class DoublyLinkedList {
    public static void main(String[] args){
        DoublyLinkedListClass mydl=new DoublyLinkedListClass(2);
        mydl.getlength();
        mydl.append(3);
        mydl.prepend(1);
        mydl.prepend(0);
        System.out.println(mydl.get(0).value);
        mydl.set(1,6);
        mydl.insert(1, 9);
        mydl.remove(1);
        mydl.printlist();
    }
}
