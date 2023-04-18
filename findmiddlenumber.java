public class findmiddlenumber {
    public static void main(String[] args) {

        findmiddlenumberclass mylist = new findmiddlenumberclass(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);
        

        System.out.println("Middle Node:");
        System.out.println( mylist.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3

        */

    }
    
}
