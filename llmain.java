public class llmain {

    public static void main(String[] args) {

        llclass myLinkedList = new llclass(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);


        myLinkedList.printAll();
        
        
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2
        
        	Linked List:
        	1
        	2
        
     	*/

    }
    
}

    

