public class SortStack {
    public static void sortStack(SortStackClass<Integer> stack){
        SortStackClass<Integer> s=new SortStackClass<>();
        while(!stack.isEmpty()){
            int temp=stack.pop();
            if(s.isEmpty()){

                s.push(temp);
            }
        while(temp>stack.peek()){
            int pop=stack.pop();
            stack.push(temp);
            s.push(pop);
        }  
       
        
        }
        while(s!=null){
        System.out.println(s.pop());
    }
}

    
    // WRITE THE SORTSTACK METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////


    public static void main(String[] args) {
        SortStackClass<Integer> stack = new SortStackClass<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
 
        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3
            
            After sorting:
            1
            2
            3
            4
            5

        */
        
    }
    
}

