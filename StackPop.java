public class StackPop {
    

        public static void main(String[] args) {
    
            StackPopClass myStack = new StackPopClass();
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            
            System.out.println("Stack before pop():");
            myStack.printStack();
            
            System.out.println("\nPopped node:");
            System.out.println(myStack.pop());
            
            System.out.println("\nStack after pop():");
            myStack.printStack();
     
            /*
                EXPECTED OUTPUT:
                Stack before pop():
                3
                2
                1
                
                Popped node:
                3
                
                Stack after pop():
                2
                1
    
            */
    
        }
    
    
}
