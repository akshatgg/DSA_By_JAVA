public class Linkedlist {
    public static void main(String[] args) 
    {
        LinkedLIstClass mylist= new LinkedLIstClass(4);
        mylist.space();

        
        mylist.gethead();
        mylist.gettail();
        mylist.getlength();
        mylist.space();
        mylist.append(7);
        mylist.append2(9);
        mylist.append(20);
        mylist.printlist();
        mylist.getlength();
        mylist.space();
        mylist.remove();
        mylist.getlength();
        mylist.printlist();

    }
    
}
