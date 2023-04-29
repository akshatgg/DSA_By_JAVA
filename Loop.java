public class Loop {

    public static void main(String[] args) {

        LoopClass mylist = new LoopClass(1);
        mylist.append(3);
        mylist.append(2);
        mylist.append(4);
        mylist.append(5);
        
        // create a loop by connecting the tail to the second node
        
        
        
        System.out.println("Has Loop:");
    System.out.println( mylist.hasloop());
        
//         if(mylist.getTail().next == mylist.getHead().next){
// System.out.print("true");
//         }
// else{
//     System.out.print("false");
// }
        /*
            EXPECTED OUTPUT:
            ----------------
            Has Loop:
            true

        */

    }

}